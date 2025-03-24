/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexam;

/**
 *
 * @author Rene Lorenzo Pitahin
 */
public abstract class AbstractRoomCalculator {
    //encapsulated to protects data from class fields uses getters and setters
    //ensuring data consistency
    private int devicesOn; //Number of devices currently turned on in a room
    private int totalConsumption; //Total power consumption (in watts) for a room

    //Constructor & Encapsulation
    public AbstractRoomCalculator() {
        devicesOn = 0;
        totalConsumption = 0;
    }

    //Abstract method
    //abstraction ensures the main GUI can use room calculators
    //without knowing their internal details
    public abstract void calculateConsumption(); 
    /*
    *Any subclass (or all rooms) must implement this 
    *method and provide its own logic to calculate devicesOn and totalConsumption
    */

    //Getters and setters
    
    //returns current values of devicesOn & totalConsumption
    public int getDevicesOn() {
        return devicesOn;
    }
    
    public int getTotalConsumption() {
        return totalConsumption;
    }
    
    //allows to update the rooms (subclass)
    //The "this" is required because it is referring to the instance variable, 
    //not the parameter
    
    public void setDevicesOn(int devicesOn) {
        this.devicesOn = devicesOn;
    }

    public void setTotalConsumption(int totalConsumption) {
        this.totalConsumption = totalConsumption;
    }
}
