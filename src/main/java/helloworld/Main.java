package helloworld;

import helloworld.behavioral.mediator.HelloWorldInterjection;
import helloworld.behavioral.mediator.HelloWorldMediator;
import helloworld.behavioral.mediator.HelloWorldObject;
import helloworld.behavioral.state.HelloWorldStateContext;
import helloworld.behavioral.strategy.DesignPatternHelloWorldStrategy;
import helloworld.behavioral.strategy.HelloWorldStrategyContext;
import helloworld.behavioral.visitor.HelloWorldCharacterElements;
import helloworld.behavioral.visitor.HelloWorldCharacterVisitor;
import helloworld.structural.bridge.DesignPatternWorldImpl;
import helloworld.structural.bridge.HelloWorldBridge;
import helloworld.structural.flyweight.HelloWorldFlyWeightFactory;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        System.out.println("We are creational patterns!");

        System.out.println("====================================");
        System.out.println("We are structural patterns!");

        System.out.println("7. Bridge: ");
        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        //leave bridgeHelloWorld' output to compositeHelloWorld

        System.out.println("11. Flyweight: ");
        HelloWorld flyWeightHelloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        System.out.println(flyWeightHelloWorld.helloWorld());

        System.out.println("====================================");
        System.out.println("We are behavioral patterns!");

        System.out.println("17. Mediator: ");
        HelloWorldInterjection helloWorldInterjection = new HelloWorldInterjection();
        HelloWorldObject helloWorldObject = new HelloWorldObject();
        HelloWorldMediator helloWorldMediator = new HelloWorldMediator(helloWorldInterjection, helloWorldObject);
        helloWorldInterjection.setHelloWorldMediator(helloWorldMediator);
        helloWorldObject.setHelloWorldMediator(helloWorldMediator);
        System.out.println(helloWorldObject.helloWorld());

        System.out.println("20. State: ");
        HelloWorldStateContext helloWorldStateContext = new HelloWorldStateContext();
        HelloWorld stateHelloWorld = helloWorldStateContext.appendWord("Hello").appendWord("State");
        System.out.println(stateHelloWorld.helloWorld());

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
