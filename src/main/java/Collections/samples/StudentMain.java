package Collections.samples;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args){


        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student = new Student();
        student.setName("xxxx");
        student.setAge(45);

        studentArrayList.add(student);

        Student student1 = new Student();
        student1.setName("yyy");
        student1.setAge(34);

        studentArrayList.add(student1);

        Student student2 = new Student();
        student2.setName("sdfd");
        student2.setAge(34);

        studentArrayList.add(student2);


    }
}
