package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class InputListSample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> studentArrayList;

        System.out.println("Enter the number of students :");
        int stuSize = sc.nextInt();
        studentArrayList = new ArrayList<>(stuSize);

        for (int i = 0; i < stuSize; i++) {


            Student student = new Student();

            System.out.println("Enter the name :");

            String myName = sc.nextLine();

            sc.nextLine();
            student.setStuName(myName);
            System.out.println("Enter the age");
            student.setAge(sc.nextInt());


            studentArrayList.add(student);
        }

        for(Student student : studentArrayList){
            System.out.println(student.getStuName() +" - "+student.getAge());
        }


    }
}
