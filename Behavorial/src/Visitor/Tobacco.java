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
public class Tobacco implements Products{

    private final double price = 100;
    
    @Override
    public void accept(Visitor visitor) {
        visitor.calculateTax(this);                             // INSTEAD OF WRITING THE CODE HERE IN THE PRODUCTION CALSS AND CHANGING IT LIKE A MANIAC ITS 
                                                                // YOU WRITE IT IN SOME OTHER CLASS AD MAKE CHANGES IN THAT CLASS
    }

    double getPrice() {
        return this.price;
    }
    
}
