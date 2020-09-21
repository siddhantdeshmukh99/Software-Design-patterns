/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Memento {
    private final State content;
    
    public Memento(State content){
        this.content=content;
    }
    public State getContent(){
        return this.content;
    }
}
