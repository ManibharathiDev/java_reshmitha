package interfaces;

public class CarMech implements Mechatronics{

    @Override
    public void start() {
          System.out.println("Car is starting....");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelreating....");
    }

    @Override
    public void stop() {
        System.out.println("Car stop....!");
    }
}
