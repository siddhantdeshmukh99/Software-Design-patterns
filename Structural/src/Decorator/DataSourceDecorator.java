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
public class DataSourceDecorator implements DataSource {
    private DataSource dataSource;
    
    public DataSourceDecorator(){
        this.dataSource = new ConcreteDataSource();
    }
    @Override
    public void writeData(String data) {
        this.dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return this.dataSource.readData();
    }

    /**
     * @param dataSource the dataSource to set
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
}
