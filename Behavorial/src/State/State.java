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
public interface State {
    void setContext(Document document);
    void publish(boolean admin);
    String getName();
}
