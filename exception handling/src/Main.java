import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //exception = an event that occurs during the execution of a program that,
        //disrupts the normal flow of instructions

        //exception handling allows us to note the exception / error and still continue
        //with the instructions of the program

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("The result is: " + z);

            //if the user tries to divide by 0, an exception will be thrown
            //"ArithmeticException"

        }
        catch(ArithmeticException e){
            //we pass the exception we are trying to handle
            //as a parameter of our catch block, and call the exception e.

            System.out.println("You can't divide by zero silly");
        }

        //the way to handle these exceptions is to surround the high risk code
        //with a try block.
        //a try block is accompanied with a catch block, which is executed if the exception is thrown in the
        //try section of the code

        catch(InputMismatchException e){
            //we pass the exception we are trying to handle
            //as a parameter of our catch block, and call the exception e.

            //this catch block is triggered if the user inputs an unexpected data type

            System.out.println("You can only divide by whole numbers... duhhhh");
        }

        //the catch block below, catches all possible exceptions

        catch(Exception e){
            //we pass the exception we are trying to handle
            //as a parameter of our catch block, and call the exception e.

            System.out.println("Something went wrong");
        }

        finally{
            System.out.println("This block of code will always print");
            scanner.close();

            //finally block is usually used to close scanners and other files
            //if we want to use the scanner we need to remove the scanner instantiation from the try block
            //as the finally block wont notice it
        }

        //above is a finally block, this block of code will always print regardless of exceptions
        //even if there's no exception






    }
}