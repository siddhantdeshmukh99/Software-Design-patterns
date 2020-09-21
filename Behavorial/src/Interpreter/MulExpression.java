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
public class MulExpression implements Expression{
    private Expression left;
    private Expression right;
    public MulExpression(Expression left,Expression right){
        this.left=left;
        this.right=right;
    }
    @Override
    public int interprete() {
        return left.interprete()*right.interprete();    }
    
}
