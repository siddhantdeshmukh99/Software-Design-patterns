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
public class ThrottlingMiddleware extends Middleware {
    
    private int requestPerMinute;
    private int request;
    private long currentTime;

  

    ThrottlingMiddleware(int i) {
        this.requestPerMinute = i;
        this.currentTime = System.currentTimeMillis();
    }
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;
        
        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
    
}
