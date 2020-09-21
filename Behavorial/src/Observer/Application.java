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
public class Application {
    public Publisher start() {
        Publisher pub = new Publisher();
        EmailEventListner email1 = new EmailEventListner();
        LoggingListner logging1 = new LoggingListner();
        LoggingListner logging2 = new LoggingListner();
        pub.subscribe(email1);
        pub.subscribe(logging2);
        pub.subscribe(logging1);
        
        return pub;
    }
}
