package inputs;

public class TryCatch {

    public static void main(String[] args){
        //Exception handling
        try {
            int a = 10;

            int result = a / 2;

            System.out.println("Result " + result);
        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println("Expression is wrong");
        }
        finally {
            System.out.println("Finally Called");
        }

    }

}
