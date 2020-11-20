/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.poc.arquilliansuite;

/**
 *
 * @author cuba
 */
public class HelloWorld {
    
    public String sayHello() {
        return "Hello World!";
    }
    
    public String helloSum(int a, int b) {
        int total = a + b;
        return "Hello! The sum is " + total;
    }
    
    
}
