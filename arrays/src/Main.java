import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // array = used to store multiple values in a single variable


        // steps to turn the variable "car" into an array
        // step 1: String car = "Camaro";
        // step 2: String[] car = {"Camaro"}; next to the data type we add a set of straight brackets and surround the value(s) with curly braces.


        String[] cars = {"Camaro", "corvette", "Tesla"}; //renamed to cars


        // each position in the array is an element
        // always start from 0

        cars[0] = "Mustang"; //placing a new value in element position 0.

        System.out.println(cars[0]); //this prints the specific element in the cars array.

        System.out.println(cars[1]);

        //when you assign values the all need to be the same data type

        //below is another to assign the values of an array:

        String[] cars1 = new String[4];

        cars1[0] = "Volkswagen";
        cars1[1] = "Telsa";
        cars1[2] = "Jaguar";
        cars1[3] = "BMW";


        //how to print all the elements in an array on one line:

        System.out.println(Arrays.toString(cars1));

       for(int i=0; i< cars.length; i++){
           System.out.println(cars[i]);
           //we start our index at position 0 of the array, we define that
           // the index can only continue as far as the length of our array
           //we increment the index after each loop
           //for each loop the position of the index in the array will be printed on a line

           //using <= in the loop condition would include
           // the index equal to the length of the array,
           // which is out of bounds. That's why < is used
           // instead, ensuring the loop iterates over
           // valid indexes from 0 to cars.length - 1.


           //if you only want to print a certain range of array elements:

//           for (int j = 0; j <= 1; j++) {
//               System.out.println(cars[j]);
//           }

           //we use j as our index (counter), as long as the index is less than or equal to the position of 1 in the array
           // we will increment the index and print the value in the index's position on a new line



           // few tips, loops need to always be >= or <=, == means it will only loop once.
       }
    }
}