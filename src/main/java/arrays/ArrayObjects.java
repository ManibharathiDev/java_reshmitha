package arrays;

public class ArrayObjects {

    public static void main(String[] args){

        Students students = new Students();
        students.age = 20;
        students.name = "Johna";

        System.out.println(students.age);
        System.out.println(students.name);

        int[] age = new int[5];
        Students[] stu = new Students[5];

        stu[0] = new Students();
        stu[0].age = 20;
        stu[0].name = "John";

        stu[1] = new Students();
        stu[1].age = 22;
        stu[1].name = "Michael";

        stu[2] = new Students();
        stu[2].age = 23;
        stu[2].name = "Kumar";

        stu[3] = new Students();
        stu[3].age = 22;
        stu[3].name = "Sathya";

        stu[4] = new Students();
        stu[4].age = 27;
        stu[4].name = "Navya";

        System.out.println(stu[0].age);
        System.out.println(stu[0].name);

        for(int i = 0; i<stu.length; i++)
        {
            System.out.println("Name of the student : "+stu[i].name);
            System.out.println("Age of the student : "+stu[i].age);
        }

    }

}
