/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Connection  {
    private static Connection connection;
    public Connection(){
        /*if(connection !=null){
            throw new RuntimeException("Ek hi milega bsdk");          **** this code is added to prevent the repetative creation of the object using javas reflection api
        }*/
    }

    public static synchronized Connection getConnection() {
        if(connection == null){
            connection=new Connection();
            return connection;
        }
        return null;
    }
    
}
