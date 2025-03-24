/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexam;

/**
 *
 * @author Rene Lorenzo Pitahin
 */
public class KitchenCalculator extends AbstractRoomCalculator {
    //boolean that represents the state of each devices on the room
    private boolean mainBulbOn;
    private boolean rearBulbOn;
    private boolean sinkBulbOn;
    private boolean stoveBulbOn;
    private boolean deskBulbOn;
    private boolean airVentOn;
    private boolean rearAirVentOn;
    private boolean washerOn;
    private boolean dryerOn;

    // Constructor of all appliances
    //refers to the initial state of each devices
    //The "this" is required because it is referring to the instance variable, 
    //not the parameter.
    public KitchenCalculator(
        boolean mainBulbOn,
        boolean rearBulbOn,
        boolean sinkBulbOn,
        boolean stoveBulbOn,
        boolean deskBulbOn,
        boolean airVentOn,
        boolean rearAirVentOn,
        boolean washerOn,
        boolean dryerOn
    ) {
        this.mainBulbOn = mainBulbOn;
        this.rearBulbOn = rearBulbOn;
        this.sinkBulbOn = sinkBulbOn;
        this.stoveBulbOn = stoveBulbOn;
        this.deskBulbOn = deskBulbOn;
        this.airVentOn = airVentOn;
        this.rearAirVentOn = rearAirVentOn;
        this.washerOn = washerOn;
        this.dryerOn = dryerOn;
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

        if (rearBulbOn) {
            devices++;
            total += 60;
        }

        if (sinkBulbOn) {
            devices++;
            total += 50;
        }

        if (stoveBulbOn) {
            devices++;
            total += 50;
        }

        if (deskBulbOn) {
            devices++;
            total += 60;
        }

        if (airVentOn) {
            devices++;
            total += 40;
        }

        if (rearAirVentOn) {
            devices++;
            total += 40;
        }

        if (washerOn) {
            devices++;
            total += 500;
        }

        if (dryerOn) {
            devices++;
            total += 3000;
        }

        //Overridden method uses inherited methods 
        //(setDevicesOn and setTotalConsumption) to 
        //Update the state of the devicesOn and totalConsumption 
        //Fields in the superclass.
        setDevicesOn(devices);
        setTotalConsumption(total);
    }
}

