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
public abstract class Middleware {
    private Middleware next;
    void setnext(Middleware next){
        this.next=next;
    }
    public abstract boolean check(String password,String email);
    
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
