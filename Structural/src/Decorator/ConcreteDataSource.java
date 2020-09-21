/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class ConcreteDataSource implements DataSource{
    private String data;
    public ConcreteDataSource(){
        //connection code to the database
        this.data="";
    }
    @Override
    public void writeData(String data) {
        this.data = this.data.concat(data);
    }

    @Override
    public String readData() {
        return this.data;
    }
    
}
