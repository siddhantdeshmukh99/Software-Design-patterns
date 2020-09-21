/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class TerminalExpression implements Expression {

    private int data;
    public TerminalExpression(int data){
        this.data=data;
    }
    @Override
    public int interprete() {
        return this.data;
    }
    
}
