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
public class Editor {
    private State content;
    public Editor(State content){
        this.content = content;
    }
    public Memento save(){
        return new Memento(content);
    }
    public void restore(Memento editorState){
        this.content = editorState.getContent();
    }
    public void editContent(String content){
        this.content = new State(content);
    }
    public String getContent(){
        return content.getData();
    }
}
