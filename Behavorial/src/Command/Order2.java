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
public class Order2 implements Order{
    String[] items;
    ChefOrReceiver receiver;
    Order2(String[] items,ChefOrReceiver receiver){
        this.items=items;
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.make(items);
    }
}
