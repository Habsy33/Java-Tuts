import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // 2D ArrayList = a dynamic (possibility to change) list of lists
        // you can change the size of these lists during runtime


        ArrayList<ArrayList<String>> groceryList  = new ArrayList<>();

        // in the line of code above, we are declaring a new arrayList but this arraylist contains arraysLists
        //we are naming this 2d arraylist "groceryList" and we are going to use it below

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("donuts");
        bakeryList.add("garlic bread");

        // for our normal arraylists we declare their reference data types and we use the .add methods to populate them:

        ArrayList<String> produceList = new ArrayList<>();
        bakeryList.add("Tomato");
        bakeryList.add("peppers");
        bakeryList.add("lettuce");

        ArrayList<String> drinksList = new ArrayList<>();
        bakeryList.add("soda");
        bakeryList.add("coffee");
        bakeryList.add("orange list");


        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);


        // in the code above in the 2d arraylist "groceryList" you can see we're using
        // the .add methods to add the "normal" arrayLists to our overall grocerylist

        System.out.println(groceryList);

        //above we are printing the groceryList contents, which includes the elements of the bakery, produce and drinks lists

        System.out.println(groceryList.get(0));

        //running the code above will print the elements of the arraylist in position 0 of our 2d arraylist "groceryList"

        System.out.println(groceryList.get(0).get(0));

        //when we run this code we are going to print the elements of the arraylist in positio 0 of our 2d array list, but we're going
        //a  step further and printing the element found in the position 0 in our inner list.

        
    }
}