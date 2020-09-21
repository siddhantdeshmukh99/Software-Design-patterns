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
public abstract class Dad {
    public int noseLength;
    public int eyesDiameter;
    public Dad(){}
    public Dad(Dad obj){
        if(obj != null){
            this.noseLength=obj.noseLength;
            this.eyesDiameter=obj.eyesDiameter;
        }
    }
    public abstract Dad clone();
}
