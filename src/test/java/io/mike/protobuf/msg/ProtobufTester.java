package io.mike.protobuf.msg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;

import io.mike.protobuf.msg.Protobuf.MultipleMessage;

/**
 * 
 * 示例 PB 编解码会出现的各种情况
 * @author zhaoming
 *
 * 2017年11月3日 下午4:58:19
 */
public class ProtobufTester {

	private static final Logger log = LoggerFactory.getLogger(ProtobufTester.class);
	
	@Test
	public void test_result() throws Exception {
		log.debug("{}", new Object[]{
					Protobuf.Result.newBuilder()
						.setCode(200)
						.setMessage("OK")
						.setExtend(
								Protobuf.ResultExtend.newBuilder()
									.setExtendStr("extend mike").build()
					).build()
				}
		);
	}
	
	@Test
	public void test_multiple_message() throws Exception {
		log.debug("{}", new Object[] { Protobuf.MultipleMessage.newBuilder()
				.addMsg("A1")
				.addMsg("A2")
				.setMsg(0, "A0")
				.build() });
	}
	
	@Test(expected = UninitializedMessageException.class)
	public void test_text_config_uninitialized_message_exception() throws Exception {
		log.debug("not init required field.");
		Protobuf.TextConfig.newBuilder()/*.setId(1)*/.build();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void test_multiple_message_index_out_of_bounds_exception() throws Exception {
		log.debug("{}", new Object[] { Protobuf.MultipleMessage.newBuilder()
				.addMsg("A1")
				.addMsg("A2")
				.setMsg(2, "A3")	//数组越界
				.build() });
	}
	
	@Test(expected = InvalidProtocolBufferException.class)
	public void test_invalid_protocol_buffer_exception() throws IOException {
		log.debug("{}", "消息被篡改，导致的解析异常。");
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		Protobuf.MultipleMessage.newBuilder()
		.addMsg("A1")
		.addMsg("A1")
		.build().writeTo(byteOut);
        
        byte[] byteArray = byteOut.toByteArray();
        
        byte[] temp = new byte[byteArray.length];
        log.debug("{}", temp.length);
        for (int i = 0; i < byteArray.length; i++) {
        	if(i == 4) {
        		temp[i] = 65;
        	} else {
        		temp[i] = byteArray[i];
        	}
		}
        ByteArrayInputStream byteInt = new ByteArrayInputStream(temp);
        
        MultipleMessage parseFrom = Protobuf.MultipleMessage.parseFrom(byteInt);
        log.debug("{}", parseFrom);
	}
}
