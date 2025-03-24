/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexam;

/**
 *
 * @author Rene Lorenzo Pitahin
 */
public class BedroomCalculator extends AbstractRoomCalculator {
    //boolean that represents the state of each devices on the room
    private boolean airConditionerOn;
    private boolean electricFanOn;
    private boolean heaterOn;
    private boolean leftLampOn;
    private boolean mainBulbOn;
    private boolean rightLampOn;

    //Constructor to initialize all appliances
    //refers to the initial state of each devices
    //The "this" is required because it is referring to the instance variable, 
    //not the parameter.
    public BedroomCalculator(
        boolean airConditionerOn,
        boolean electricFanOn,
        boolean heaterOn,
        boolean leftLampOn,
        boolean mainBulbOn,
        boolean rightLampOn
    ) {
        this.airConditionerOn = airConditionerOn;
        this.electricFanOn = electricFanOn;
        this.heaterOn = heaterOn;
        this.leftLampOn = leftLampOn;
        this.mainBulbOn = mainBulbOn;
        this.rightLampOn = rightLampOn;
    }

    @Override
    //Provides a specific implementation of the calculateConsumption
    //Ensures compatibility with the superclass and polymorphism
    public void calculateConsumption() {
        int devices = 0;
        int total = 0;

        if (airConditionerOn) {
            devices++;
            total += 1000;
        }

        if (electricFanOn) {
            devices++;
            total += 70;
        }

        if (heaterOn) {
            devices++;
            total += 1500;
        }

        if (leftLampOn) {
            devices++;
            total += 40;
        }

        if (mainBulbOn) {
            devices++;
            total += 60;
        }

        if (rightLampOn) {
            devices++;
            total += 40;
        }

        //Overridden method uses inherited methods 
        //(setDevicesOn and setTotalConsumption) to 
        //Update the state of the devicesOn and totalConsumption 
        //Fields in the superclass.
        setDevicesOn(devices);
        setTotalConsumption(total);
    }
}
