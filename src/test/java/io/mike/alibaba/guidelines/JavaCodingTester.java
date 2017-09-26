package io.mike.alibaba.guidelines;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.mike.alibaba.guidelines.support.CodingTester;
import io.mike.alibaba.guidelines.support.ExceptionTester;
import io.mike.alibaba.guidelines.support.LevelType;
import io.mike.alibaba.guidelines.support.MysqlTester;
import io.mike.alibaba.guidelines.support.ProjectTester;
import io.mike.alibaba.guidelines.support.SecurityTester;
import io.mike.alibaba.guidelines.support.UnitTester;

/**
 * 举例：
 * 	1、数据库的表结构、索引设计 	=> 架构缺陷、性能风险
 * 	2、工程结构混乱			=> 后续维护艰难
 * 	3、没有鉴权的漏洞代码		=> hacker attack
 * 
 * 手册划分
 * 	1、编程规范			{@link CodingTester}
 * 	2、异常日志 		{@link ExceptionTester} 
 * 	3、单元测试			{@link UnitTester}
 * 	4、安全规约			{@link SecurityTester}
 * 	5、工程结构			{@link ProjectTester}
 * 	6、数据库(mysql)	{@link MysqlTester}
 * 
 * 约束力强弱以及故障敏感性
 * 	强制{@link LevelType#enforce} > 推荐{@link LevelType#recommend} > 参考{@link LevelType#reference}
 * 
 * 远景：码出高效、码出质量
 * 
 * https://github.com/alibaba/p3c
 * 
 * @author zhaoming
 *
 * 2017年9月26日 上午10:57:42
 */
@RunWith(Suite.class)
@SuiteClasses({
	CodingTester.class,
	ExceptionTester.class,
	UnitTester.class,
	SecurityTester.class,
	ProjectTester.class,
	MysqlTester.class
})
public class JavaCodingTester {
	
	@Test
	public void main() {
		JUnitCore.runClasses(JavaCodingTester.class);
	}
	
	
}
