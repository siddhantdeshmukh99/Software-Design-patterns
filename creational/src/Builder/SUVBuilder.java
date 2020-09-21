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
public class SUVBuilder implements Builder{
    private SUV obj;
    @Override
    public void reset() {
        this.obj=new SUV();
    }

    @Override
    public void numberOfCylinders() {
        this.obj.cylinder=4;
    }

    @Override
    public void numberOfSeats() {
        this.obj.seats=6;
    }

    public void fourWheelDrive(boolean b) {
        this.obj.fourWheelDrive=b;
    }

    public SUV returnObj() {
        return this.obj;
    }

    @Override
    public void alloywheels(boolean b) {
        this.obj.alloyWheels=b;
    }
    
}
