/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;
import java.util.Scanner;
/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Client {
    boolean encryptionEnabled,compressionEnabled;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        DataSource ds = new ConcreteDataSource();
        System.out.println("enter if you want encryption and or compression respectively:\n");
        if(cin.nextBoolean()){
            ds = new EncryptionDecorator();
        }
        if(cin.nextBoolean()){
            ds = new CompressionDecorator();
        }
        System.out.println("enter data: ");
        ds.writeData(cin.next());
        System.out.println(ds.readData());
    }
}
