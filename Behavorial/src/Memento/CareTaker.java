/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.Stack;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class CareTaker {
    private Stack<Memento> history;

    public CareTaker() {
        this.history = new Stack<Memento>();
    }
    public Memento getPreviousState(){
        return this.history.pop();
    }
    public void saveState(Memento editorState){
        this.history.push(editorState);
    }
}
