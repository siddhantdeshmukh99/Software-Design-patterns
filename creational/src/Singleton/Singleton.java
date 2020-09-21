/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Singleton {
    public static void main(String[] args){
        System.out.println(Connection.getConnection().hashCode());
        System.out.println(Connection.getConnection().hashCode());
        /*try {
            Class<Connection> clazz = Connection.class;
            Constructor<Connection> cons = clazz.getDeclaredConstructor();                    **** reflection api of java used to create duplicate class and its object
            cons.setAccessible(true);
            System.out.print(cons.newInstance().hashCode());
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            System.out.print("bola tha bsdk ek hi milega");
        }*/                   
    } 
}
