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
public class Published implements State {

    private Document document;
    private final String name = "Published";
    @Override
    public void setContext(Document document) {
        this.document=document;
    }
    
    public void publish(boolean admin){
        // do nothing
        document.changeState(this);
    }
    
   public void expire(){
       if(document.getExpireYear()>new Date().getYear()){
           document.changeState(new Draft());
       }
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
 
}
