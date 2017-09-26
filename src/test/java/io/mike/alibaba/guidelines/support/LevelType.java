package io.mike.alibaba.guidelines.support;

/**
 * 规范等级枚举
 * @author zhaoming
 *
 * 2017年9月26日 上午11:26:19
 */
public enum LevelType {
	
	/** 强制实施 */
	enforce		(1,	"强制"),
	/** 推荐实施 */
	recommend	(2,	"推荐"),
	/** 参考实施 */
	reference	(3,	"参考");
	
	private LevelType(int code, String name) {
		this.code = code;
		this.name = name;
	}
	private int code;
	private String name;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
