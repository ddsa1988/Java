package org.s008_Classes.models;

import java.security.InvalidParameterException;

public class Vehicle {
    public int passengers;
    public int fuelCapacity;
    public int milesPerGallon;

    public Vehicle() {
        this(1, 1, 1);
    }

    public Vehicle(int passengers, int fuelCapacity, int milesPerGallon) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.milesPerGallon = milesPerGallon;
    }

    public int range() {
        return fuelCapacity * milesPerGallon;
    }

    public double fuelNeeded(int miles) {
        if (miles <= 0)
            throw new InvalidParameterException("Parameter miles must be greater than zero.");

        if (milesPerGallon <= 0)
            throw new InvalidParameterException("Parameter miles per gallon must be greater than zero.");

        return (double) miles / milesPerGallon;
    }

    @Override
    public String toString() {
        return "Passengers: " + passengers + ", Fuel capacity: " + fuelCapacity + ", Miles per gallon: "
                + milesPerGallon;
    }
}
