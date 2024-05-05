public class Main {
    public static void main(String[] args) {

        // inheritance = the process where one class acquires, the attributes and methods of another

        // we want our car and bicycle classes to inherit everything from the vehicle class


        Car car = new Car();
        car.go();

        // you can see in the code above that we created a new car object
        //we use the .go method, however this is not found in our Car class
        // the reason we can use it, is due to inheritance- where we inherited the classes
        // and variables of the Vehicles class

        // if you remove the extends class keyword when defining the class, it wont inherit the attributes and methods
        //of the class that you want i.e. Vehicle


        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);


        System.out.println(car.doors);
        System.out.println(bike.pedals);

        //these last 2 print statements are class specifc attributes, meaning they aren't found
        //in a shared class like Vehicle.
        //this is logical as a car doesn't have pedals. and a bike doesn't have doors


    }
}