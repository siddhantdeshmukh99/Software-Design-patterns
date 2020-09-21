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
public class Director {
    private Builder builder; 
    public void makeSUV(Builder builder,boolean fourWheelDrive,boolean alloyWheels){
        this.builder=builder;
        builder.reset();
        builder.numberOfCylinders();
        builder.numberOfSeats();
        builder.alloywheels(alloyWheels);
        builder.fourWheelDrive(fourWheelDrive);
    }
    public void makeSedan(Builder builder,boolean alloyWheels){
        this.builder=builder;
        builder.reset();
        builder.numberOfCylinders();
        builder.numberOfSeats();
        builder.alloywheels(alloyWheels);
        builder.fourWheelDrive(false);
    }
}
