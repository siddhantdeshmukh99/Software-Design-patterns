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
public class NonVegNoodles extends Noodles{

    @Override
    public void setNoodles() {
        super.items= new String[] {"chicken noodles","lobster noodles","fish noodles"} ;
    }
    
}
