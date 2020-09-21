/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class WaiterOrInvoker {
    Order order;
    void setOrder(Order order) {
        this.order=order;
    }
    void sendOrder(){
        this.order.execute();
    }

    
}
