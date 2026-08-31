package inputs;

import java.util.Scanner;

public class InputsOne {

    public static void main(String[] args){
        //int age = 10;
        //System.out.println("The age is "+age);
        Scanner sc = new Scanner(System.in);
        try {

            //int age = sc.nextInt();

            //System.out.println("The age is "+age);
            String name = sc.nextLine();
            System.out.println("My name is " + name);
            System.out.println("Enter the First Number");
            int firstNumber = sc.nextInt();
            System.out.println("Enter the Second Number");
            int secondNumber = sc.nextInt();

            int result = firstNumber + secondNumber;
            System.out.println("The result is " + result);
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            sc.close();
        }


    }

}
