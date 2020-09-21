/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;
import java.util.Scanner;
/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Client {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Document doc = new Document(new Draft());          // initital state of the document
        
        System.out.println("here the admin will enter the password");
        doc.editData("this is a thesis on State Pattern first commit");
        System.out.print("enter password: ");             //here the admin will enter the password
        doc.publish("password".equals(cin.next()));      
        System.out.println(doc.state.getName());
        
        System.out.println("");
        Document doc1 = new Document(new Draft());          // initital state of the document
        System.out.println("here the nonadmin will try to publish his new edited document");
        doc1.editData("this is a thesis on State Pattern second commit");
        System.out.print("enter password: ");               // here the nonadmin will enter the wrong password
        doc1.publish("password".equals(cin.next()));      
        System.out.println(doc1.state.getName());
        
        System.out.println("the user tries to change the state but his thesis is rejected so the state is changed back to \"draft state\"");
        System.out.print("enter password: ");               // the user tries to change the state but his thesis is rejected so the state is changed back to "draft state"
        doc1.publish("password".equals(cin.next()));
        System.out.println(doc1.state.getName());
        
        
        System.out.println("");
        Document doc2 = new Document(new Draft());          // initital state of the document
        System.out.println("here the nonadmin will try to publish his new edited document again");
        doc2.editData("this is a thesis on State Pattern third commit");
        System.out.print("enter password: ");               // here the nonadmin will enter the password
        doc2.publish("password".equals(cin.next()));      
        System.out.println(doc2.state.getName());
        
        System.out.println("now this time the admin tries to change the state, but although his thesis is rejected it gets published since its the admin who is changing the state");
        System.out.print("enter password: ");               // now the admin tries to change the state, but although his thesis is rejected it gets 
                                                            // published since its the admin who is changing the state
        doc2.publish("password".equals(cin.next()));
        System.out.println(doc2.state.getName());
    }
}
