/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Client {
    public static void main(String[] args) {
        Products milk = new Necessity();
        Visitor visit = new TaxVisitor();
        milk.accept(visit);                             // its like you want to try out new feature in your app but cannot put it(code it) directly into production classes 
                                                        // as no one knows, will the public will like it or not and also this make bring a lot of potential bugs in the code
                                                        // so you make a visitor class, add all your code into the class and make the production classes accept the visitor 
                                                        // to do its work. This pattern reduces coupling makes refactoring easy (easy to add remove more new features)
    }
}
