package helloworld.structural.bridge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldBridgeTest {

    @Test
    public void testHelloWorldAdapter(){
        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new JavaHelloWorldImpl());
        assertThat(bridgeHelloWorld.helloWorld(),is("Hello Java!"));
        bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        assertThat(bridgeHelloWorld.helloWorld(),is("Hello Bridge!"));
    }
}
