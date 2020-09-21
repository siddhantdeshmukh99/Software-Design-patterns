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
public class FastFoodNonVegCreator implements AbstractFastFoodCreator {

    @Override
    public Noodles MakeNoodles() {
        return new NonVegNoodles();
    }

    @Override
    public Burger MakeBurger() {
        return new NonVegBurger();
    }
    
}
