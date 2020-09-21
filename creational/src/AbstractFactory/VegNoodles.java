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
public class VegNoodles extends Noodles{

    @Override
    public void setNoodles() {
       super.items= new String[] {"paneer noodles","schezwan veg noodles","tripple veg noodles"} ;
    }
    
}
