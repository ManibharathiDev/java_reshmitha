package Collections;

import java.util.HashSet;

public class HashSetSample {

    public static void main(String[] args){
        HashSet<Integer> ageSet = new HashSet<>();
        //Add Values
        ageSet.add(10);
        ageSet.add(25);
        ageSet.add(50);
        ageSet.add(10); // Dublicate Value
        ageSet.add(67);

        System.out.println(ageSet);

        // hashset -> order is not predictable & doesn't store insertion order/sorting

        System.out.println("Size of ageSet is "+ageSet.size());

        //contains

        if(ageSet.contains(10)){
            System.out.println("10 is already available");
        }

        for(Integer i : ageSet){
            System.out.println(i);
        }

        HashSet<String> ageStringSet = new HashSet<>();
        ageStringSet.add("Ten");
        ageStringSet.add("Twelve");
        ageStringSet.add("Twelve");
        ageStringSet.add("Twenty Five");

        System.out.println(ageStringSet);

        ageStringSet.remove("Ten");

        System.out.println(ageStringSet);

    }
}
