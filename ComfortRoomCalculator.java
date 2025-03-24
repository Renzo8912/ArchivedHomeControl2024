/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexam;

/**
 *
 * @author Rene Lorenzo Pitahin
 */
public class ComfortRoomCalculator extends AbstractRoomCalculator {
    //boolean that represents the state of each devices on the room
    private boolean mainBulbOn;
    private boolean exhaustOn;
    private boolean showerBulbOn;

    // Constructor of all appliances
    //Refers to the initial state of each devices
    //The "this" is required because it is referring to the instance variable, 
    //not the parameter.
    public ComfortRoomCalculator(
            boolean mainBulbOn, 
            boolean exhaustOn, 
            boolean showerBulbOn
    ) {
        this.mainBulbOn = mainBulbOn;
        this.exhaustOn = exhaustOn;
        this.showerBulbOn = showerBulbOn;
    }

    @Override
    //Provides a specific implementation of the calculateConsumption
    //Ensures compatibility with the superclass and polymorphism
    public void calculateConsumption() {
        int devices = 0;
        int total = 0;

        if (mainBulbOn) {
            devices++;
            total += 60;
        }
        if (exhaustOn) {
            devices++;
            total += 40;
        }
        if (showerBulbOn) {
            devices++;
            total += 50;
        }
        
        //Overridden method uses inherited methods 
        //(setDevicesOn and setTotalConsumption) to 
        //Update the state of the devicesOn and totalConsumption 
        //Fields in the superclass.
        setDevicesOn(devices);
        setTotalConsumption(total);
    }
}
