package Collections;

import java.util.LinkedList;

public class LinkedListSample {

    public static void main(String[] args){

        //Declaration

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        for (int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
            System.out.print(" ");
        }

        linkedList.add(1,56);

        linkedList.addFirst(10);

        linkedList.addLast(70);





    }

}
