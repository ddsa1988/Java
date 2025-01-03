package org.s008_Classes;

import org.s008_Classes.models.Vehicle;

public class VehicleDemo {
    public static void userMain() {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportCar = new Vehicle(2, 14, 12);

        System.out.println("Minivan => " + minivan);
        System.out.println("Sport car => " + sportCar);
        System.out.println();

        System.out.printf("Minivan range => %d.\n", minivan.range());
        System.out.printf("Sport car range => %d.\n", sportCar.range());
    }
}