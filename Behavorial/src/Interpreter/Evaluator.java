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
public class Evaluator {
    public static void main(String[] args) {
        Expression ex0 = new TerminalExpression(5);
        Expression ex1 = new TerminalExpression(9);
        Expression ex2 = new TerminalExpression(2);
        Expression ex3 = new TerminalExpression(3);
        Expression ex4 = new AddExpression(ex1,ex0);
        Expression ex5 = new MulExpression(ex4,ex2);
        Expression ex6 = new AddExpression(ex5,ex4);
        System.out.println(ex6.interprete());
    }
}
