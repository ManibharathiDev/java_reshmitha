package Collections;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args)
    {
        //Array

        int[] age = new int[2];
        age[0] = 15;
        age[1] = 29;

        System.out.println(age[0]);

        // Array List

        ArrayList<Integer> ageArrayList = new ArrayList<>();

        ageArrayList.add(10);

        ageArrayList.add(16);

        System.out.println(ageArrayList.get(0));

        ageArrayList.add(45);

        System.out.println(ageArrayList.get(2));

        System.out.println(ageArrayList.toString());

        // Different Data Types

        //Integer

        ArrayList<Integer> intArray = new ArrayList<>();

        intArray.add(50);
        intArray.add(40);
        intArray.add(78);

        // Double

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        //Float

        ArrayList<Float> floatArrayList = new ArrayList<>();

        //String

        ArrayList<String> stringArrayList = new ArrayList<>();

        //Traversing

        for(int i = 0; i < intArray.size(); i++)
        {
           // intArray.remove(0);
            System.out.println(intArray.get(i));

        }



       /* for(Integer iArray : intArray){
            System.out.println(iArray);
            //intArray.remove(2);
        }*/


        // Functions

        intArray.add(45);

        intArray.add(0,32);

      /*  for(Integer iArray : intArray){
            System.out.println(iArray);
            //intArray.remove(2);
        }*/

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(100);
        myList.add(200);

        intArray.addAll(myList);

        intArray.addAll(0,myList);

        for(Integer iArray : intArray){
            System.out.println(iArray);
            //intArray.remove(2);
        }

        if(intArray.contains(200)){
            System.out.println("It is available");
        }
        else{
            System.out.println("It is not available");
        }



        //System.out.println(intArray.contains(200));
    }

}
