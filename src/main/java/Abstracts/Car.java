package Abstracts;

public class Car extends Mechanical{
    @Override
    void start() {
        System.out.println("Car Start....");
    }

    @Override
    void acclerate() {
        System.out.println("Car Accelerating...");
    }

    @Override
    void stop() {
        System.out.println("Car Stop....!");
    }
}
