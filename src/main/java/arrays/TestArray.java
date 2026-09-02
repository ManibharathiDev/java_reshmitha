package arrays;

public class TestArray {

    public static void main(String[] args){

        //int[] arr = {10,20,30,40,50};

        //System.out.println(arr[0]);

        //Primitives Array (int,char,boolean,double,float,long,short,bytes

        // Non primitives - String -> RESHMITHA


        //Declaring an Array

        //dataType[] arryaName or dataType arrayName[]

        int[] age;

        //Initilization an array

        age = new int[5];

        //Assigning an array
        age[0] = 25;
        age[1] = 28;
        age[2] = 56;
        age[3] = 90;
        age[4] = 78;

        String[] stuNames = {"John","Mathew","Venkat"};

        System.out.println("The fourth element is "+age[3]);

        // Traversing array

        for(int i = 0; i < 5; i++)
        {
            System.out.println(age[i]);
        }

        for(int i = 0; i < stuNames.length; i++ ){
            System.out.println(stuNames[i]);
        }
        //Update an array

        age[2] = 62;





    }

}
