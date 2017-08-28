package io.mike.design.pattern.gof;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午3:20:35
 */
public class SplitMessage implements Message {

	private MessageHead head;
	private MessageBody body;
	
	public SplitMessage(MessageHead head, MessageBody body) {
		super();
		this.head = head;
		this.body = body;
	}
	
	@Override
	public String encode() {
		return head.head() + "|" + body.body();
	}

	public interface MessageHead { public String head(); }
	public interface MessageBody { public String body(); }
	
	public static class DefaultMessageHead implements MessageHead {

		@Override
		public String head() {
			return "head:";
		}
		
	}
}
