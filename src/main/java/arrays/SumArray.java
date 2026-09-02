package arrays;

public class SumArray {

    public static void main(String[] args){

        int add[] = new int[5];
        add[0] = 10;
        add[1] = 20;
        add[2] = 30;
        add[3] = 40;
        add[4] = 50;

        //Sum of the array
        int sum = 0;
        for(int i = 0; i < add.length; i++){
            sum = sum + add[i];
        }

        System.out.println("The result is "+sum);

    }

}
