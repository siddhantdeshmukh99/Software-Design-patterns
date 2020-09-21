/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptar;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class ConcreteAdaptar implements Adapter1,Adapter2{
    private Application app;
    ConcreteAdaptar(Application app){
        this.app=app;
    }
    @Override
    public String method1(String data) {
        boolean temp = app.appMethod(Integer.parseInt(data,10));
        return (temp)?"Value is greater than 69":"value is less than 69";
    }

    @Override
    public String method2(String data) {
        boolean temp = app.appMethod(Integer.parseInt(data,2));
        return (temp)?"Value is greater than 69":"value is less than 69";
    }
    
    
}
