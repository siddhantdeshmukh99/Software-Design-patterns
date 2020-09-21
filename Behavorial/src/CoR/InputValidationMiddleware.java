/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoR;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class InputValidationMiddleware extends Middleware{

    @Override
    public boolean check(String password, String email) {
        if(password.length()<50 & password.length()>=8 & email.length()<50){
            return checkNext(password,email);
        }else{
            return false;
        }
    }
    
}
