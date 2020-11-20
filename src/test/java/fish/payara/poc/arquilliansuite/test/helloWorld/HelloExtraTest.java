/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.poc.arquilliansuite.test.helloWorld;

import fish.payara.poc.arquilliansuite.HelloExtra;
import fish.payara.poc.arquilliansuite.test.Deployments;
import static org.junit.Assert.*;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author cuba
 */
@RunWith(Arquillian.class)
public class HelloExtraTest extends Deployments {
    
    @Test
    public void testSayHello() {
        HelloExtra helloExtra = new HelloExtra();
        assertTrue(helloExtra.sayHello(2, 4).equals("Hello! a + b = 6"));
    }
    
}
