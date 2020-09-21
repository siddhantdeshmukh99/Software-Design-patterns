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
public class TaxVisitor implements Visitor{
    
    @Override
    public void calculateTax(Necessity aThis) {
        System.out.println("Tax: "+aThis.getPrice()*0.05);
    }

    @Override
    public void calculateTax(Liquor aThis) {
        System.out.println("Tax: "+aThis.getPrice()*0.18);
    }

    @Override
    public void calculateTax(Tobacco aThis) {
        System.out.println("Tax: "+aThis.getPrice()*0.28);
    }
    
    
    
}
