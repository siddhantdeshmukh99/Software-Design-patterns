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
public class Moderation implements State {
    private Document document;
    private final String name = "Moderation";
    @Override
    public void setContext(Document document) {
        this.document=document;
    }
    
    public void publish(boolean admin){
        if(admin){
            document.changeState(new Published());
        }else {
            if(this.moderate())
                document.changeState(new Published());
            else
                document.changeState(new Draft());
            
        }
    }

    private boolean moderate() {
        // some plagerism algorithm or api
        return false;                       // the thesis gets rejected
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    
}
