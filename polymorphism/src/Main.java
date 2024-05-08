public class Main {
    public static void main(String[] args) {

        //polymorphism = greek word for poly- "many", morph-"form"
        //the ability of an object to identify as more than one data type


        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

//        Car[] racers = {car, bike, boat};
        //the above array wont work, as the objects are all different types
        //i.e. a car array will be able to store the car classes object, but not the boat or bike
        // a boat array will be able to store the boat classes object but not the bike or car
        //and so on...
        //since all the subclasses have the same superclasses
        //we can use Vehicle as the common between the classes

        Vehicle[] racers = {car, bike, boat};

//        car.go();
//        bike.go();
//        boat.go();
        //we created go methods in each of our classes
        // there's a better way to do this however:

        for(Vehicle x : racers){
            x.go();

            //we are looping through the vehicle superclass, we use x (our objects)
            //as a counter. the colon means "in the" racers array
            //for each loop of the objects, we run the .go method. using x as a placeholder
            //for our objects


            //the concept of polymorphism in this tutorial demonstrates how
            //each of these classes are multiple data types;
            //Car class is also part of Vehicle class
            //Bicycle class is also part of Vehicle class
            //Boat class is also part of vehicle class


        }


    }
}