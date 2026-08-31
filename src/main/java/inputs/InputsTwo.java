package inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputsTwo {

    public static boolean isOnlyLetters(String input) {
        // Returns true if the input has 1 or more uppercase or lowercase letters
        return input != null && input.matches("^[a-zA-Z]+$");
    }

    public static void main(String[] args) {
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            InputStreamReader ir = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(ir);

            System.out.println("Enter the first number");

            String fNumber = br.readLine();

            if(isOnlyLetters(fNumber)){
                System.out.println("Invalid input");
                return;
            }

            if(fNumber.equals("0")){
                System.out.println("Input is invalid");
                return;
            }

            int firstNumber = Integer.parseInt(fNumber);

            //int firstNumber = Integer.parseInt(br.readLine());

            System.out.println("Enter the Second number");

            int secondNumber = Integer.parseInt(br.readLine());

            int result = firstNumber/secondNumber;

            //int result = firstNumber + secondNumber;

            System.out.println("The result is "+result);
        }

        catch (NumberFormatException e){
            //e.printStackTrace();
            System.out.println("Please enter only numbers");
        } catch (IOException e) {
            System.out.println("Please enter any value");
        }
        catch (ArithmeticException e){
            System.out.println("You cannot do this operation");
        }



    }
}
