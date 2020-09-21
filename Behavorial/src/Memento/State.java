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
class State {
    private String data;

    public State(String data){
        this.data = data;
    }
    /**
     * @return the content
     */
    public String getData() {
        return data;
    }
    
}
