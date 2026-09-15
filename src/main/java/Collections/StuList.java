package Collections;

import java.util.ArrayList;

public class StuList {
    public static void main(String[] args){

        ArrayList<Integer> intArray = new ArrayList<>();

        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student = new Student();
        student.setAge(35);
        student.setStuName("John");

        studentArrayList.add(student);

        Student student2 = new Student();
        student2.setAge(36);
        student2.setStuName("Michael");
        studentArrayList.add(student2);

        System.out.println(studentArrayList);

        for(Student myStudent : studentArrayList){
            System.out.println("Age: "+myStudent.getAge());
            System.out.println("Name: "+myStudent.getStuName());
        }

    }
}
