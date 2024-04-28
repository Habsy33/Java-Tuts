import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList = a resizable array.
        // unlike regular arrays, elements can be added and removed after compilation phase
        // can store reference data types


        ArrayList<String> food = new ArrayList<String>();

        //this is how we define a new array list, as said previously it only accepts reference data types so all data types must be from wrapper classes


        food.add("pizza");
        food.add("Burger");
        food.add("Ice Cream");

        // the arrayList has methods such as .add which allows us to add new elements into the array list.


        food.set(0, "sushi");

        // the arraylist has methods such as .set which allows us to specify the position change values of the array list's elements

        food.remove(2);

        // .remove specifies the position of the element you would like to remove from the arrayList

//        food.clear();
        // .clear removes the elements in the arraylist

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));

            // to print out the elements in the arraylist we are going to:
            // set the index counter to the element in position 0;
            // make the counter less than the size of the overall arraylist
            //increment after each loop until the conditions have been fully met
            // for each loop we use the arraylists .get method which allows us to retriev eht elements in the arrylist
            // we use the index as the element that will be retrieved
            // we print each element in this loop on a line
        }

    }
}