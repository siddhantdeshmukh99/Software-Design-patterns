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
public class Client {
    public static void main(String[] args) {
        WaiterOrInvoker waiter = new WaiterOrInvoker();
        Order1 ord1 =new Order1(new String[]{"Tandoori Chicken","PBM","garlic naan"},new ChefOrReceiver());
        waiter.setOrder(ord1);
        waiter.sendOrder();
        Order2 ord2 =new Order2(new String[]{"Ice cream","Milk Shake"}, new ChefOrReceiver());
        waiter.setOrder(ord2);
        waiter.sendOrder();
    }
    
    
}
