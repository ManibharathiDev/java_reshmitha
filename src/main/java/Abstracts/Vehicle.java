package Abstracts;

public class Vehicle {

    public static void main(String[] args){
        Bike bike = new Bike();
        bike.start();
        bike.acclerate();
        bike.stop();

        bike.inventedYear();

        Car car = new Car();
        car.start();
        car.acclerate();
        car.stop();

        car.inventedYear();
    }
}
