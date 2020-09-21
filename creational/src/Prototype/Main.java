/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Main {
    public static void main(String[] args){
        MyKid mk= new MyKid();
        mk.extrovert=true;
        mk.eyesDiameter=1;
        mk.height=182;
        mk.noseLength=3;                                                        // THERE COULD BE MANY MORE VARIABLES..
        
        MyKid mkc = (MyKid)mk.clone();
        
        System.out.println(mkc.extrovert);
        System.out.println(mkc.eyesDiameter);
        System.out.println(mkc.height);
        System.out.println(mkc.noseLength);                                     // so here we just duplicated a super complicated object(with inheritance and all) perfectly
    }                                                                           // WITHOUT REINITIALIZING ALL THE VARIABLES
}
