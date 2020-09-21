/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;
import java.util.Date;
/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Document {
    public State state;
    private String str;
    private int expireYear;
    
    public Document(State state){
        this.state=state;
        state.setContext(this);
    }
    void editData(String str){
        this.str=str;
    }
    void changeState(State state){
        this.state=state;
        state.setContext(this);
        if( Published.class==state.getClass()){
            setExpireYear(new Date().getYear()+3);
        }
    }
    
   void publish(boolean admin){
       this.state.publish(admin);
   }

    /**
     * @return the expireYear
     */
    public int getExpireYear() {
        return expireYear;
    }

    /**
     * @param expireYear the expireYear to set
     */
    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }
   
}
