/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Liquor implements Products{
    
    private final double price = 4000;
    @Override
    public void accept(Visitor visitor) {
        visitor.calculateTax(this);
    }

    double getPrice() {
        return this.price;
    }
    
}
