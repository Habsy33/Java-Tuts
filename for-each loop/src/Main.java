import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in the array/collection
        // less steps, and more readable
        // however its less flexible than a for loop

        String[] animals = {"cat", "dog", "rat", "bird"};


        ArrayList<String> animales = new ArrayList<String>();

        animales.add("cat");
        animales.add("dog");
        animales.add("rat");
        animales.add("bird");

        //colon means in


        for(String i : animales){
            System.out.println(i);

            //basically the for each loop is different as the brackets of the for loop
            // specify that, for each String in (":") the collection / array "animals"
            // print the element found in the index
        }

        //The purpose of a for-each loop is to iterate through all elements of a collection
        // or array without needing to specify a starting point or manage an index explicitly.
        // It's often used when you want to iterate through all elements of a collection in a simple and concise way,
        // without needing to know or care about the index of each element.
    }
}