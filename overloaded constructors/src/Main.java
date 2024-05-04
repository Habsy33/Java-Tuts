public class Main {
    public static void main(String[] args) {

        // overloaded constructors = multiple constructors within a class with the same name
        // but have different parameters
        // name + parameters = signature
        // similar logic as overloaded methods


        Pizza pizza = new Pizza("italian","tomato","mozzarella");
        System.out.println("Here are the ingredients of your Pizza: ");
        System.out.println("The bread you chose is: " + pizza.bread);
        System.out.println("The sauce you chose is: " + pizza.sauce);
        System.out.println("The cheese you chose is: " + pizza.cheese);
        System.out.println("The topping you chose is: " + pizza.topping);

        // suppose we have a situation where we don't want to select all of the attributes
        // of the pizza class, given our current constructor we can't remove attributes from the object

        //this is where overloaded constructors come in, using the same pizza class instantiation
        // we can choose between 1 to 4 attributes of our pizza



    }
}