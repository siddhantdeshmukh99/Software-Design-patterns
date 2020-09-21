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
public interface DataSource {
    public void writeData(String data);
    public String readData();
}
