package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {

    //Store unique elements with sorting

    public static void main(String[] args){

        TreeSet<Integer> ageTreeSet = new TreeSet<>();

        //Set<Integer> ageSet = new TreeSet<>();

        ageTreeSet.add(10);
        ageTreeSet.add(5);
        ageTreeSet.add(4);
        ageTreeSet.add(56);
        ageTreeSet.add(34);
        ageTreeSet.add(1);
        ageTreeSet.add(4); // Dublicate

        System.out.println(ageTreeSet);

        // Output is predictable & maintain order

        TreeSet<String> nameSet = new TreeSet<>();
        nameSet.add("Zotopia");
        nameSet.add("Xylophone");
        nameSet.add("Baloon");
        nameSet.add("Avatar");
        nameSet.add("Cartoon");

        //System.out.println(nameSet);

        /*for(String age:nameSet){
            System.out.println(age);
        }*/

        //Remove elements

        if(nameSet.contains("Cartoon")){
            nameSet.remove("Cartoon");
        }

        for(String age:nameSet){
            System.out.println(age);
        }

    }

}
