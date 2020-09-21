/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Publisher {
    private ArrayList<EventListner> listners = new ArrayList<>();
    public final String name = "Publisher1";
    void subscribe(EventListner e){
        this.listners.add(e);
    }
    
    void unsubscribe(EventListner e){
        this.listners.remove(e);
    }
    
    void notifySubscriber(){
        for(EventListner x:this.listners){
            x.update(this);
        }
    }
}
