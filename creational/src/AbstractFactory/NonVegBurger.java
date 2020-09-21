/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class NonVegBurger  extends Burger{

    @Override
    public void setBurger() {
        super.items= new String[] {"chicken burger","lobster burger","fish burger"} ;
    }
    
}
