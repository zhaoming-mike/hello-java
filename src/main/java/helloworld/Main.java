package helloworld;

import helloworld.behavioral.strategy.DesignPatternHelloWorldStrategy;
import helloworld.behavioral.strategy.HelloWorldStrategyContext;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("21. Strategy: ");
        HelloWorldStrategyContext helloWorldStrategyContext = new HelloWorldStrategyContext(new DesignPatternHelloWorldStrategy());
        System.out.println(helloWorldStrategyContext.helloWorld());
    }
    
    
}
