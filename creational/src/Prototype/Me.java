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
public class Me extends Dad{
    public int height;
    public Me(){}
    public Me(Me obj){
        super(obj);
        if(obj != null){
            this.height=obj.height;
        }
    }
    @Override
    public Dad clone() {
        return new Me(this);
    }
    
}
