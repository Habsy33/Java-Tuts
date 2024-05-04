public class Main {
    public static void main(String[] args) {

        // the standard steps of creating an array:
        // specify the data type of the array, then the array name
        // = new [number of arrays];

        Food[] fridge = new Food[3];

        // this is one way of assigning the objects to an array, we declare a new food array called fridge
        // and set it to how many elements we want in the array.

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Glizzy");
        Food food3 = new Food("Chocolate");

        // these are seperate objects of the Food class

        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;

        // since computers always start at 0 we are assigning the elements of the array of objects
        // to our objects

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);

    }
}