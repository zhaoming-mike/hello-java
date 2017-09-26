package io.mike.alibaba.guidelines.support;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


import org.junit.Assert;

/**
 * 1、编程规范
 * @author zhaoming
 *
 * 2017年9月26日 上午11:15:25
 */
public class CodingTester {

	@Test
	@Level(LevelType.enforce)
	public void test_name_base() throws Exception {
		//【强制】代码中的命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束。
		String _name 	= "不太好的变量名";
		String __name 	= "不太好的变量名";
		String $Object 	= "不太好的变量名";
		String Object$ 	= "不太好的变量名";
		String name_ 	= "不太好的变量名";
		String name$ 	= "不太好的变量名";
		assertThat(_name, 	is("不太好的变量名"));
		assertThat(__name, 	is("不太好的变量名"));
		assertThat($Object,	is("不太好的变量名"));
		assertThat(Object$,	is("不太好的变量名"));
		assertThat(name_,	is("不太好的变量名"));
		assertThat(name$,	is("不太好的变量名"));
	}
	
	@Test
	@Level(LevelType.enforce)
	public void test_name_chinese() throws Exception {
		//【强制】代码中的命名严禁使用拼音与英文混合的方式，更不允许直接使用中文的方式。 
		//说明：正确的英文拼写和语法可以让阅读者易于理解，避免歧义。注意，即使纯拼音命名方式也要避免采用。
		String alibaba 	= "不错的命名";
		String taobao 	= "不错的命名";
		String youku 	= "不错的命名";
		String beijing 	= "不错的命名";
		assertThat(alibaba, 	is("不错的命名"));
		assertThat(taobao, 		is("不错的命名"));
		assertThat(youku, 		is("不错的命名"));
		assertThat(beijing, 	is("不错的命名"));
		
		String daZhePromotion 	= "不太好的拼音和英文混合命名【打折】";
		String pingfenByName 	= "不太好的拼音和英文混合命名【评分】";
		String 一个变量			= "不太好的中文命名";
		assertThat(daZhePromotion, 	is("不太好的拼音和英文混合命名【打折】"));
		assertThat(pingfenByName, 	is("不太好的拼音和英文混合命名【评分】"));
		assertThat(一个变量, 			is("不太好的中文命名"));
	}
	@Test
	public void test() throws Exception {
		Assert.assertEquals(1, 1);
	}
	
	
}
