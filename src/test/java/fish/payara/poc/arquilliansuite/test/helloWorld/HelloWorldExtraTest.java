/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.poc.arquilliansuite.test.helloWorld;

import fish.payara.poc.arquilliansuite.HelloWorld;
import fish.payara.poc.arquilliansuite.test.Deployments;
import org.jboss.arquillian.junit.Arquillian;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author cuba
 */
@RunWith(Arquillian.class)
public class HelloWorldExtraTest extends Deployments {
    
    @Test
    public void testSayHelloExtra() {
        HelloWorld helloWorldExtra = new HelloWorld();
        assertTrue(helloWorldExtra.helloSum(2, 4).equals("Hello! The sum is 6"));
    }
    
}
