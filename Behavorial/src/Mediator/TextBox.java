/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class TextBox {
    private Mediator mediator;
    private String data;
    public boolean visibility;
    TextBox(){
        this.visibility= false;
    }
    boolean verifyAllEntries() {
        return data != null ; 
    }
    void Operation(){
        mediator.notify(this);
    }
}
