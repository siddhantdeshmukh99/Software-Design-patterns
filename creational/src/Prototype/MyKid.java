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
public class MyKid extends Me{
    boolean extrovert;
    public MyKid(){}
    public MyKid(MyKid obj){
        super(obj);
        if(obj != null){
            this.extrovert=obj.extrovert;
        }
    }
    @Override
    public Dad clone(){
        return new MyKid(this);
    }
}
