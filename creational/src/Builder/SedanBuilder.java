/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class SedanBuilder implements Builder{
    private Sedan obj;
    @Override
    public void reset() {
        this.obj=new Sedan();
    }

    @Override
    public void numberOfCylinders() {
        this.obj.cylinder=2;
    }

    @Override
    public void numberOfSeats() {
        this.obj.seats=4;
    }
    
    public void fourWheelDrive(boolean b){
        this.obj.fourWheelDrive=b;
    }
    
    public Sedan returnObj() {
        return this.obj;
    }

    @Override
    public void alloywheels(boolean b) {
        this.obj.alloyWheels=b;
    }

    
}
