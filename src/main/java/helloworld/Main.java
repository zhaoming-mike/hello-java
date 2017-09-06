package helloworld;

import helloworld.behavioral.strategy.DesignPatternHelloWorldStrategy;
import helloworld.behavioral.strategy.HelloWorldStrategyContext;
import helloworld.behavioral.visitor.HelloWorldCharacterElements;
import helloworld.behavioral.visitor.HelloWorldCharacterVisitor;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        System.out.println("We are creational patterns!");

        System.out.println("====================================");
        System.out.println("We are structural patterns!");

        System.out.println("====================================");
        System.out.println("We are behavioral patterns!");

        System.out.println("21. Strategy: ");
        HelloWorldStrategyContext helloWorldStrategyContext = new HelloWorldStrategyContext(new DesignPatternHelloWorldStrategy());
        System.out.println(helloWorldStrategyContext.helloWorld());

        System.out.println("23. Visitor: ");
        HelloWorldCharacterElements helloWorldCharacterElements = new HelloWorldCharacterElements("Hello Visitor!".toCharArray());
        HelloWorldCharacterVisitor helloWorldCharacterVisitor = new HelloWorldCharacterVisitor();
        helloWorldCharacterElements.accept(helloWorldCharacterVisitor);
        System.out.println(helloWorldCharacterVisitor.helloWorld());

    }
}
