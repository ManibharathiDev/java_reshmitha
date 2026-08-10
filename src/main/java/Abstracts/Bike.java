package Abstracts;

public class Bike extends Mechanical{
    @Override
    void start() {
        System.out.println("Bike Start...");
    }

    @Override
    void acclerate() {
        System.out.println("Bike Accelerating...");
    }

    @Override
    void stop() {
        System.out.println("Bike stop....!");
    }
}
