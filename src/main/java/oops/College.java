package oops;

import javax.management.DescriptorAccess;

public class College {
    public static void main(String[] args)
    {
        /*Students s1 = new Students(); // new keyword
        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.name = "Arun";
        System.out.println(s1.name);

        Students s2 = new Students();
        System.out.println(s2.name);
        s2.name = "Pooja";

        Teachers t1 = new Teachers();
        t1.name = "John";
        t1.department = "CSE";
        t1.salary = 35000;

        System.out.println(t1.name);
        System.out.println(t1.department);
        System.out.println(t1.salary);*/

        //Department d1 = new Department("CSE","Michael",2020);
        Department d1 = new Department("Anna University");
        System.out.println(d1.collegeName);
        d1.deptName = "CSE";
        d1.hod = "Michael";
        d1.startYear = 2020;
        System.out.println(d1.deptName);
        System.out.println(d1.hod);
        System.out.println(d1.startYear);

        Department d3 = new Department();

        System.out.println(d3.collegeName);

        Department d4 = new Department("Rayan Instatutie");

        Department d2 = new Department("Jeppiar Institute");

        Department d5 = new Department(9);
        // Empty Constructor;
        // Parameterized Constructor;

    }
}
