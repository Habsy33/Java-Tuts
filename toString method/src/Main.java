public class Main {
    public static void main(String[] args) {

        // toString() = special method that all objects inherit
        // that returns a string that textually "represents" an object
        // can be used both implicitly and explicitly


        Car car  = new Car();
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.color);

        // if we ran the above print statements, the car classes attributes will be printed
        // howver this way is long and inefficient, a better way to do this is using the
        // toString method:

//        System.out.println(car);

        // if you run this print statement with the object car
        // you will recieve a code like : "Car@1b6d3586"
        // you are basically printing the location of the car object, rather than printing the contents of the car class


        System.out.println(car.toString());
        //here we are explicitly calling the toString method

        // the line above prints the same result as earlier, where we are printing the car objects
        //location. If we want to use toString to print all the attributes of the car class, we need to override it
        // to override it we will go into the Car class and add some lines of code:



        //System.out.println(car);
        // running the above line will now print the attributes of the car object fom the Car class
        // this line calls the toString implicitly

    }
}