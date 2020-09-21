/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Client {
    public static void main(String[] args) {
        Director dir = new Director();
        SUVBuilder suvbuilder = new SUVBuilder();
        dir.makeSUV(suvbuilder,true, true);
        SUV suv = suvbuilder.returnObj();
    }
}
