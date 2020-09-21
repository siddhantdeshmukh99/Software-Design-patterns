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
public class EmailEventListner implements EventListner {

    @Override
    public void update(Publisher pub) {
        System.out.println("update from: "+ pub.name);
    }
    
}
