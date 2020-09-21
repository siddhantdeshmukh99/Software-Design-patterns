/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Client {
    public static void main(String[] args) {
        Application app = new Application();
        
        // client does some action which invokes the publisher and publisher notifies all its subscriber
        
        
        Publisher pub = app.start();
        pub.notifySubscriber();
    }
}
