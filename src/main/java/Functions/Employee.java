package Functions;

public class Employee
{

    static String myName = "John"; // Global Variable

    public static void main(String[] args)
    {

        String herName = "Naveena"; // Local Variable

        printHerName(herName);

        System.out.println(myName);

        add();
        add();
        add();

        add(15,65);
        add(67,100);

        add(34,56.8f);

        add(45,67,89);

        // Small unit of program or sub program
        // Avoid repetitions

        //Additions
        /*int a = 10;
        int b = 20;

        int c = a+b;

        a = 30;
        b = 45;
        c = a+b;

        a = 50;
        b = 60;
        c = a+b;*/

        int sub = subtract();
        System.out.println("The result is "+sub);

        int mul = multiply(90,20);
        System.out.println(mul);
    }

    static void printHerName(String herName){
        System.out.println(herName);
    }

    //Without Return and Without Arguments
    static void add()
    {

        System.out.println(myName);

        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("The result is "+c);
    }

    //Function Overloading or Method Overloading

    //Without return and With Arguments;
    static void add(int a, int b){
        int c = a+b;
        System.out.println("The result is "+c);
    }
    static void add(int a,float b){
        System.out.println("I am called");
    }
    static void add(int a, int b, int c){
        System.out.println("Three arguments");
    }
    //With Return Without Arguments
    static int subtract(){
        int a = 10;
        int b = 5;
        return a-b;
    }
    //With Return with Arguments
    static int multiply(int a,int b){
        return a*b;
    }

}
