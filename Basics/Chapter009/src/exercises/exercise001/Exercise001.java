package exercises.exercise001;

import java.util.Arrays;
import java.util.List;

public interface Exercise001 {
    public static void userMain() {
        List<IVehicle> objs = Arrays.asList(new Car(), new Bike());

        for (IVehicle obj : objs) {
            obj.start();
            obj.stop();
            obj.honk();
            System.out.println();
        }
    }
}

class Car implements IVehicle {

    @Override
    public void start() {
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Bike implements IVehicle {

    @Override
    public void start() {
        System.out.println("Bike started...");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped...");
    }
}

interface IVehicle {
    public void start();

    public void stop();

    public default void honk() {
        System.out.println("Default honk for the vehicle.");
    }
}
