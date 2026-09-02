package arrays;

import java.util.Scanner;

public class InputsArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int size;

        System.out.println("Enter the size of an array");

        size = scanner.nextInt();

        int[] num = new int[size];

        System.out.println("Size of the array is "+num.length);

        for(int i = 0; i < size; i++){
            System.out.println("Enter "+(i+1)+" value");
            num[i] = scanner.nextInt();
        }

        System.out.println("Sum of the array");

        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += num[i]; // sum = sum + num[i]
        }

        System.out.println("The result is "+sum);

    }

}
