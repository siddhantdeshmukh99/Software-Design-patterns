/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptar;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Client1 {
    public static void main(String[] args) {
        
        Adapter1 adaptar1 = new ConcreteAdaptar(new Application());
        //Request sent from the client of type1 device
        System.out.println(adaptar1.method1("244"));
        System.out.println(adaptar1.method1("2"));
        
        Adapter2 adapter2 = new ConcreteAdaptar(new Application());
        //Request sent from the client of type2 device
        System.out.println(adapter2.method2("1110101"));
        System.out.println(adapter2.method2("10111"));
    }
}
