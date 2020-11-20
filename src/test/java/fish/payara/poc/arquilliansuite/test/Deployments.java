 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.poc.arquilliansuite.test;

import fish.payara.poc.arquilliansuite.HelloExtra;
import fish.payara.poc.arquilliansuite.HelloWorld;
import fish.payara.poc.arquilliansuite.test.helloWorld.HelloExtraTest;
import fish.payara.poc.arquilliansuite.test.helloWorld.HelloWorldExtraTest;
import org.eu.ingwar.tools.arquillian.extension.suite.annotations.ArquillianSuiteDeployment;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;

/**
 *
 * A Class for containing all deployments for these
 * basic samples
 * 
 * No. of deployments with suite: 2
 * No. of deployments without suite: 6
 * 
 * Importantly the large number of deployments without suite is
 * due to the use of a Deployments class which all test classes extend
 * (results in all deployments within the Deployments class being
 * deployed regardless of them being used or now within the test class)
 * 
 * No. of deployments without Deployments class: 3
 * 
 * @author cuba
 */
@ArquillianSuiteDeployment
public class Deployments {

    @Deployment(name = "world")
    public static WebArchive deployWorld() {
        return ShrinkWrap.create(WebArchive.class, "world.war")
                .addClass(Deployments.class)
                .addPackage(HelloWorld.class.getPackage());
    }

    @Deployment(name = "extra") // Gets deployed twice WITHOUT suite as used by two test classes
    public static WebArchive deployExtra() {
        return ShrinkWrap.create(WebArchive.class, "extra.war")
                .addClass(Deployments.class)
                .addClass(HelloExtra.class)
                .addClass(HelloExtraTest.class)
                .addClass(HelloWorldExtraTest.class);
    }
    
}
