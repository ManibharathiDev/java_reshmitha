package interfaces;

import Abstracts.Bike;

public class VehicleMain
{
    public static void main(String[] args){


        Mechatronics bike = new BikeMech();
        bike.start();
        bike.accelerate();
        bike.stop();




        Mechatronics car = new CarMech();
        car.start();
        car.accelerate();
        car.stop();
    }
}
