package helloworld;

import helloworld.behavioral.iterator.HelloWorldCharacterIterator;
import helloworld.behavioral.mediator.HelloWorldInterjection;
import helloworld.behavioral.mediator.HelloWorldMediator;
import helloworld.behavioral.mediator.HelloWorldObject;
import helloworld.behavioral.memento.HelloWorldMementoOriginator;
import helloworld.behavioral.observer.HelloWorldObserver;
import helloworld.behavioral.observer.Subject;
import helloworld.behavioral.state.HelloWorldStateContext;
import helloworld.behavioral.strategy.DesignPatternHelloWorldStrategy;
import helloworld.behavioral.strategy.HelloWorldStrategyContext;
import helloworld.behavioral.template_method.TemplateMethodHelloWorld;
import helloworld.behavioral.visitor.HelloWorldCharacterElements;
import helloworld.behavioral.visitor.HelloWorldCharacterVisitor;
import helloworld.structural.adapter.HelloAdapterDesignPattern;
import helloworld.structural.adapter.HelloWorldAdapter;
import helloworld.structural.bridge.DesignPatternWorldImpl;
import helloworld.structural.bridge.HelloWorldBridge;
import helloworld.structural.composite.CompositeHelloWorld;
import helloworld.structural.decorator.HelloWorldDecorator;
import helloworld.structural.facade.HelloWorldFacade;
import helloworld.structural.flyweight.HelloWorldFlyWeightFactory;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        System.out.println("We are creational patterns!");

        System.out.println("====================================");
        System.out.println("We are structural patterns!");

        System.out.println("6. Adapter: ");
        HelloWorld adapterHelloWorld = new HelloWorldAdapter(new HelloAdapterDesignPattern());
        System.out.println(adapterHelloWorld.helloWorld());

        System.out.println("7. Bridge: ");
        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        //leave bridgeHelloWorld' output to compositeHelloWorld

        System.out.println("8. Composite: ");
        HelloWorld compositeHelloWorld = new CompositeHelloWorld(bridgeHelloWorld, new CompositeHelloWorld.DefaultHelloWorld());
        System.out.println(compositeHelloWorld.helloWorld());

        System.out.println("9. Decorator: ");
        HelloWorldDecorator decoratorHelloWorld = new HelloWorldDecorator(new HelloWorldDecorator.DefaultHelloWorld());
        System.out.println(decoratorHelloWorld.helloDecorator());

        System.out.println("10. Facade: ");
        HelloWorld facadeHelloWorld = HelloWorldFacade.instance().facadeHelloWorld();
        System.out.println(facadeHelloWorld.helloWorld());

        System.out.println("11. Flyweight: ");
        HelloWorld flyWeightHelloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        System.out.println(flyWeightHelloWorld.helloWorld());

        System.out.println("====================================");
        System.out.println("We are behavioral patterns!");

        System.out.println("16. Iterator: ");
        HelloWorldCharacterIterator helloWorldCharacterIterator = new HelloWorldCharacterIterator("Hello Iterator!".toCharArray());
        while (helloWorldCharacterIterator.hasNext()) {
            System.out.print(helloWorldCharacterIterator.next());
        }
        System.out.println();

        System.out.println("17. Mediator: ");
        HelloWorldInterjection helloWorldInterjection = new HelloWorldInterjection();
        HelloWorldObject helloWorldObject = new HelloWorldObject();
        HelloWorldMediator helloWorldMediator = new HelloWorldMediator(helloWorldInterjection, helloWorldObject);
        helloWorldInterjection.setHelloWorldMediator(helloWorldMediator);
        helloWorldObject.setHelloWorldMediator(helloWorldMediator);
        System.out.println(helloWorldObject.helloWorld());

        System.out.println("18. Memento: ");
        HelloWorldMementoOriginator helloWorldMementoOriginator = new HelloWorldMementoOriginator();
        HelloWorldMementoOriginator.Memento memento = helloWorldMementoOriginator.set("Hello Memento!").saveToMemento();
        helloWorldMementoOriginator.set("Hello Whatever!");
        helloWorldMementoOriginator.restoreFromMemento(memento);
        System.out.println(helloWorldMementoOriginator.helloWorld());

        System.out.println("19. Observer: ");
        Subject subject = new Subject().attach(new HelloWorldObserver());
        subject.notifyObservers();

        System.out.println("20. State: ");
        HelloWorldStateContext helloWorldStateContext = new HelloWorldStateContext();
        HelloWorld stateHelloWorld = helloWorldStateContext.appendWord("Hello").appendWord("State");
        System.out.println(stateHelloWorld.helloWorld());

        System.out.println("21. Strategy: ");
        HelloWorldStrategyContext helloWorldStrategyContext = new HelloWorldStrategyContext(new DesignPatternHelloWorldStrategy());
        System.out.println(helloWorldStrategyContext.helloWorld());

        System.out.println("22. Template Method: ");
        HelloWorld templateMethodHelloWorld = new TemplateMethodHelloWorld();
        System.out.println(templateMethodHelloWorld.helloWorld());

        System.out.println("23. Visitor: ");
        HelloWorldCharacterElements helloWorldCharacterElements = new HelloWorldCharacterElements("Hello Visitor!".toCharArray());
        HelloWorldCharacterVisitor helloWorldCharacterVisitor = new HelloWorldCharacterVisitor();
        helloWorldCharacterElements.accept(helloWorldCharacterVisitor);
        System.out.println(helloWorldCharacterVisitor.helloWorld());

    }
}
