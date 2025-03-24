/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexam;

/**
 *
 * @author Rene Lorenzo Pitahin
 */
public class LivingRoomCalculator extends AbstractRoomCalculator {
    //boolean that represents the state of each devices on the room
    private boolean airConditionOn;
    private boolean bulb1On;
    private boolean bulb2On;
    private boolean chandelierOn;
    private boolean heaterOn;
    private boolean saltLampOn;
    private boolean standLampOn;
    private boolean televisionOn;

    // Constructor to initialize all appliances
    //refers to the initial state of each devices
    //The "this" is required because it is referring to the instance variable, 
    //not the parameter.
    public LivingRoomCalculator(
        boolean airConditionOn,
        boolean bulb1On,
        boolean bulb2On,
        boolean chandelierOn,
        boolean heaterOn,
        boolean saltLampOn,
        boolean standLampOn,
        boolean televisionOn
    ) {
        this.airConditionOn = airConditionOn;
        this.bulb1On = bulb1On;
        this.bulb2On = bulb2On;
        this.chandelierOn = chandelierOn;
        this.heaterOn = heaterOn;
        this.saltLampOn = saltLampOn;
        this.standLampOn = standLampOn;
        this.televisionOn = televisionOn;
    }

    @Override
    //Provides a specific implementation of the calculateConsumption
    //Ensures compatibility with the superclass and polymorphism
    public void calculateConsumption() {
        int devices = 0;
        int total = 0;


        if (airConditionOn) {
            devices++;
            total += 1000;
        }

        if (bulb1On) {
            devices++;
            total += 60;
        }

        if (bulb2On) {
            devices++;
            total += 60;
        }

        if (chandelierOn) {
            devices++;
            total += 150;
        }

        if (heaterOn) {
            devices++;
            total += 1500;
        }

        if (saltLampOn) {
            devices++;
            total += 25;
        }

        if (standLampOn) {
            devices++;
            total += 60;
        }

        if (televisionOn) {
            devices++;
            total += 200;
        }

        //Overridden method uses inherited methods 
        //(setDevicesOn and setTotalConsumption) to 
        //Update the state of the devicesOn and totalConsumption 
        //Fields in the superclass.
        setDevicesOn(devices);
        setTotalConsumption(total);
    }
}
