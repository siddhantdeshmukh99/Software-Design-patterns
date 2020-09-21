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
public class Client {
    public static void main(String[] args){
        AbstractFastFoodCreator food = new FastFoodVegCreator();
        Noodles noodles=food.MakeNoodles();
        noodles.setNoodles();
        System.out.print(noodles.items);
    }
}
