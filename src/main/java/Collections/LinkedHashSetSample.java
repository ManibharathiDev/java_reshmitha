package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {

    //Stores unique elements and it remembers the order they are added

    public static void main(String[] args)
    {
        LinkedHashSet<String> age = new LinkedHashSet<>();
        age.add("Animal");
        age.add("Cartoon");
        age.add("Dog");
        age.add("Enemy");
        age.add("Dog");
        age.add("Dog");age.add("Dog");

        //

        System.out.println(age);

        boolean isDogExist = age.contains("Dog");
        System.out.println("Dog Availability "+isDogExist);

        age.clear();




    }




}
