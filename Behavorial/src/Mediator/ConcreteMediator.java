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
public class ConcreteMediator implements Mediator {
    
    private final CheckBox checkBox = new CheckBox();
    private final Button submitButton = new Button();
    private final TextBox textBox = new TextBox();
    private final TextBox optionalTextBox = new TextBox();
    @Override
    public void notify(Object sender) {
        if(sender.equals(submitButton)){
            this.reactOnButton();
        }else if(sender.equals(checkBox)){
            this.reactOnCheckBox();
        }else if(sender.equals(textBox)){
            this.reactOnTextBox();
        }
    }

    private void reactOnButton() {
        textBox.verifyAllEntries();                                //suppose one wanted to verify all the data filled in the form after one clicks on the submit button
        optionalTextBox.verifyAllEntries();
    }

    private void reactOnCheckBox() {
        optionalTextBox.visibility= true;                          //suppose one needs to make a textentry visible after checking for "dogs name" in forgot password page
    }

    private void reactOnTextBox() {
        // anything can be written
    }
    
}
