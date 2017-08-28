package io.mike.design.pattern.gof.behavioral.interpreter;

import java.util.Map;

import static org.apache.commons.lang3.StringUtils.*;

import com.google.common.collect.Maps;

/**
 * 简单的数学表达式解释器
 * 
 * 	func : add('1+2')
 * 		计算:1 + 2 的值
 * 
 * @author zhaoming
 *
 * 2017年8月28日 下午2:21:43
 */
public class MathInterpreter {

	private Map<String, MathFunc> mathFuncMaps;
	
	public MathInterpreter() {
		registerFunc("add", new PlusFunc(System.out));
	}
	
	public void interpret(String expression) {
		String functionName = trim(substringBefore(expression, "("));
		//System.out.println(functionName);
		MathFunc mathFunc = mathFuncMaps.get(functionName);
		String substringAfter = substringAfter(expression, "(");
		String substringBeforeLast = substringBeforeLast(substringAfter, ")");
		String stripArgs = strip(substringBeforeLast, "'");
		//System.out.println(stripArgs);
		mathFunc.exec(stripArgs);
	}
	
	/**
	 * 注册一个函数
	 * @param name	函数名
	 * @param func	函数本身
	 */
	public void registerFunc(String name, MathFunc mathFunc) {
		if(mathFuncMaps == null)
			mathFuncMaps = Maps.newHashMap();
		mathFuncMaps.put(name, mathFunc);
	}
	
	
}
