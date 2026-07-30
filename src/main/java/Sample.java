public class Sample {

    public static void main(String[] args)
    {

        //Variables

        int myAge = 25;

        //String myAgeString = "My Age is "+myAge;

        System.out.println("My Age is "+myAge);

        //Rules

        int hisAge = 25; //Valid
        //int her age = 35; //Invalid
        //int 8herAge = 45; //Invalid
        //int her8Age =78; //Valid
        //int her_Age = 67; //Valid
        int _herAge = 89; //Valid

        // Datatypes
        //short,byte,int,long
        //float,double
        //boolean
        //char
        //String

        //byte bNumber = 100;
        short sNumber = 3;
        byte bNumber = 127;

        System.out.println("Byte Range");
        System.out.println(Byte.MIN_VALUE + " to "+Byte.MAX_VALUE); //-128 to 127
        System.out.println("Short Range");
        System.out.println(Short.MIN_VALUE + " to "+Short.MAX_VALUE); //-32768 to 32767
        System.out.println("Integer Range");
        System.out.println(Integer.MIN_VALUE + " to "+Integer.MAX_VALUE);
        System.out.println("Long Range");
        System.out.println(Long.MIN_VALUE + " to "+Long.MAX_VALUE);
        //short value = 100;

        //Precisions
        System.out.println("Float Range");
        System.out.println(Float.MIN_VALUE + " to "+Float.MAX_VALUE);

        System.out.println("Double Range");
        System.out.println(Double.MIN_VALUE + " to "+Double.MAX_VALUE);

        //boolean result = true; //true/false

        //char myFirstLetter = 'M';


    }

}
