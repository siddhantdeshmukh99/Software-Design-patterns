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
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor(new State(""));
        CareTaker careTaker = new CareTaker();
        editor.editContent("First Commit");
        careTaker.saveState(editor.save());
        System.out.println(editor.getContent());
        
        editor.editContent("Second Commit");
        System.out.println(editor.getContent());
        editor.restore(careTaker.getPreviousState());
        
        
        System.out.println(editor.getContent());
        
        
    }
}
