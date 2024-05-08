import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //polymorphism = many shapes/forms
        //dynamic = after compilation (during runtime)
        //dynamic polymorphism = ability of an object to make many shapes / forms
        //after program is already running


        //ex. A corvette is a : corvette, and a car, and a vehicle, and an object


        Scanner scanner = new Scanner(System.in);
        Animal animal;

        //we don't instantiate the animal class completely
        //we create a new scnnaer object, to collect user inputs


        System.out.println("What animal do you want?");
        System.out.print("1 - Dog, 2 - Cat");
        int choice = scanner.nextInt();

        //after the user inputs a choice 1 / 2 - any other input will be invalid


        if (choice ==1 ){
            animal = new Dog();
            animal.speak();

            //we create an if statement to handle the user input logic
            //if the user chooses the first option
            // we instantiate the animal as a dog
            //and can use the overridden speak method via overloaded methods


        } else if (choice ==2) {
            animal = new Cat();
            animal.speak();

            //if the user chooses the 2nd option
            //we instantiate the animal as a cat
            //and can use the overidden speak method via overloaded methods


        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }

        //in our else condition
        //if neither of the choices are input by the user
        //then the line will be printed on a new line
        //and the default speak method will be run



        //dynamic polymorphism is very handy, as the user can specify which object type they require
        //during runtime, allowing flexibility

    }
}