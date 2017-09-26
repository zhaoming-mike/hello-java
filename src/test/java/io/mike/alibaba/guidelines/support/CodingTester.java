package io.mike.alibaba.guidelines.support;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.junit.Test;

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
	@Level(LevelType.enforce)
	public void test_name_upper_camel_case() throws Exception {
		//【强制】类名使用 UpperCamelCase 风格，必须遵从驼峰形式，但以下情形例外：DO / BO / DTO / VO / AO
		
		//分层领域模型规约
		/**
		 *  Plain Ordinary Java Object
			POJO {
				DO: 	数据对象 		Data Object
				DTO:	数据传输对象	Data Transfer Object
				BO:		业务对象		Business Object
				VO:		展示对象		View Object
			}
		 */
		
		// AO:	应用对象(在 Web 层与 Service 层之间抽象的复用对象模型，极为贴近展示层，复用度不高。)	Application Object
		
		MarcoPolo marcoPolo = new MarcoPolo("OK的驼峰命名");
		assertThat(marcoPolo.desc, is("OK的驼峰命名"));
		
		UserDO userDO = new UserDO("Mike");
		assertThat(userDO.name, is("Mike"));
	}
	
	public static class MarcoPolo { private String desc; public MarcoPolo(String desc) { this.desc = desc; } }
	public static class UserDO { private String name; public UserDO(String name) { this.name = name; } }
	
	@Test
	@Level(LevelType.enforce)
	public void test_name_lower_camel_case() throws Exception {
		//【强制】方法名、参数名、成员变量、局部变量都统一使用lowerCamelCase风格，必须遵从驼峰形式。
		assertThat(localValue(), is("不错的方法命名"));
	}
	
	private String localValue() {
		return "不错的方法命名";
	}

	@Test
	@Level(LevelType.enforce)
	public void test_name_constant() throws Exception {
		assertThat(MAX_VALUE, is("不错的常量命名"));
	}
	
	public static final String MAX_VALUE = "不错的常量命名";
	
	@Test
	@Level(LevelType.enforce)
	public void test_name_abstract_class() throws Exception {
		AbstractUser abstractUser = new AbstractUser("不错的抽象类命名") {};
		BaseUser baseUser = new BaseUser("不错的抽象类命名") {};
		
		assertThat(abstractUser.desc, is("不错的抽象类命名"));
		assertThat(baseUser.desc, is("不错的抽象类命名"));
	}
	
	public static abstract class AbstractUser { private String desc; public AbstractUser(String desc) { this.desc = desc; } }
	public static abstract class BaseUser { private String desc; public BaseUser(String desc) { this.desc = desc; } }
	
	@Test
	@Level(LevelType.enforce)
	public void test_name_array() throws Exception {
		String[] args = {"不错的", "数组", "类型声明" };
		String infos[] = {"不太好的", "数组", "类型声明" };
		
		assertThat(args[0], is("不错的"));
		assertThat(args[1], is("数组"));
		assertThat(args[2], is("类型声明"));
		
		assertThat(infos[0], is("不太好的"));
		assertThat(infos[1], is("数组"));
		assertThat(infos[2], is("类型声明"));
	}
	
	@Test
	@Level(LevelType.enforce)
	public void test_name_field_name() throws Exception {
		InfoDO infoDO = new InfoDO(true, "不太好的属性名字:isOk,会被某些反序列化框架误认为是'ok'，导致异常。");
		assertThat(infoDO.desc, is("不太好的属性名字:isOk,会被某些反序列化框架误认为是'ok'，导致异常。"));
	}
	
	public static class InfoDO { 
		private boolean isOk; 
		private String desc; 
		public InfoDO(boolean isOk, String desc) {
			this.isOk = isOk;
			this.desc = desc;
		}
		public boolean isOk() {
			return isOk;
		}
		public void setOk(boolean isOk) {
			this.isOk = isOk;
		}
		
	}
	
	@Test
	public void test() throws Exception {
		Assert.assertEquals(1, 1);
	}
	
	
}
