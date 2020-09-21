/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Draft implements State{
    private Document document;
    private final String name = "Drafting";
    
    @Override
    public void setContext(Document document){
        this.document=document;
    }
    public void publish(boolean admin){
        if(admin){
            document.changeState(new Published());
        }else{
            document.changeState(new Moderation());
        }
    }

    /**
     * @return the name
     */
    public  String getName() {
        return name;
    }

}
