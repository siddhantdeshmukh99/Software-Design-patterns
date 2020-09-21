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
public interface Visitor {

    public void calculateTax(Necessity aThis);
    public void calculateTax(Liquor aThis);                                                 // method overloading *******
    public void calculateTax(Tobacco aThis);
    
    
}
