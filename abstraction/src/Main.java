public class Main {
    public static void main(String[] args) {


        //abstract = abstract classes cannot be instantiated, but they can have a subclass
        // abstract methods are declared without an implementation

        Car car = new Car();
//        Vehicle vehicle = new Vehicle();

        // we are demonstrating that normally we can create instances of classes


        //now that we applied the abstract keyword to the superclass Vehicle
        //we can no longer create an object from it
        //however we can create an object of its subclass: Car

        car.go();

    }
}