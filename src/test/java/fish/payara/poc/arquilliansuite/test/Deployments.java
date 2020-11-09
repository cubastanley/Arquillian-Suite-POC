/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.poc.arquilliansuite.test;

import fish.payara.poc.arquilliansuite.HelloWorld;
import fish.payara.poc.arquilliansuite.test.helloWorld.HelloWorldTest;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

/**
 *
 * @author cuba
 */
//@ArquillianSuiteDeployment
public class Deployments {
    
    @Deployment()
    public static JavaArchive deployWorld() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Deployments.class)
                .addClass(HelloWorld.class)
                .addClass(HelloWorldTest.class);
    }
    
}
