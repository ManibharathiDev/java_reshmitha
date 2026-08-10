package Abstracts;

public class Square extends Area{

    @Override
    void squareArea() {
        int a = 5;
        System.out.println("Area of Square "+(a*a));
    }

    @Override
    void circleArea() {
        int radius = 5;
        double PI = 3.14;
        double circleResult = 2 * PI * radius;
        System.out.println("Area of Circle "+circleResult);
    }
}
