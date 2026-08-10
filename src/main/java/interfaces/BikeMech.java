package interfaces;

public class BikeMech implements Mechatronics{
    @Override
    public void start() {
        System.out.println("Bike is starting....");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelreating....");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop....!");
    }
}
