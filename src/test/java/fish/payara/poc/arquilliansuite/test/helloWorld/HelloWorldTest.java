/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.poc.arquilliansuite.test.helloWorld;

import fish.payara.poc.arquilliansuite.HelloWorld;
import fish.payara.poc.arquilliansuite.test.Deployments;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit.Arquillian;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author cuba
 */
@RunWith(Arquillian.class)
public class HelloWorldTest extends Deployments {
    
    @Test
    @OperateOnDeployment("World")
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertTrue(helloWorld.sayHello().equals("Hello World!"));
    }
    
}
