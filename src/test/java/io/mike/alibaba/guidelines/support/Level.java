package io.mike.alibaba.guidelines.support;

/**
 * 规范等级
 * @author zhaoming
 *
 * 2017年9月26日 上午11:29:21
 */
public @interface Level {

	public LevelType value() default LevelType.reference;
}
