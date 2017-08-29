package io.mike.design.pattern.gof.behavioral.template_method;

/**
 * @author zhaoming
 *
 * 2017年8月29日 下午3:12:01
 */
public class MikeTemplateMessage extends AbstractMessage {

	String head;
	String body;
	
	public MikeTemplateMessage(String head, String body) {
		super();
		this.head = head;
		this.body = body;
	}

	@Override
	public String makeHead() {
		return head;
	}

	@Override
	public String makeBody() {
		return body;
	}

}
