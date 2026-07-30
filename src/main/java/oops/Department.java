package oops;

public class Department {
    String deptName;
    String hod;
    int startYear;
    String collegeName;

    Department(){
        this.collegeName = "MY College";
    };

    Department(String collegeName){
        this.collegeName = collegeName;
    }

    //Constructor
    Department(String deptName, String hod, int startYear)
    {
       this.deptName = deptName;
        this.hod = hod;
        this.startYear = startYear;
    }

    Department(int startYear){
        this.startYear = startYear;
    }

}
