import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //interface = a template that can be applied to a class
        // similar to inheritance but specifies what a class has / must do
        //classes can apply more than one interface, inheritance is limited to 1 superclass


        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

//        rabbit.hunt();
//        hawk.flee();

        //testing to see if the classes have access to the other interfaces methods
        //they should not have access as we haven't defined the classes to share those interfaces
        //i.e. rabbit does not use predator interface / hawk does not use prey interface


        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
        //here we are demonstrating how a class can implement multiple interfaces
        //this enables the class to access all the methods within both interfaces

//        Predator predator = new Predator();
//        predator.hunt();

        //trying to test instantiating an interface
        //turns out that all interfaces are abstract
        //but not all abstract classes are interfaces
        //i.e. they cannot be instantiated
        //they are accessed via subclasses etc

    }
}