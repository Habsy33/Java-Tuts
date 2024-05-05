public class Car extends Vehicle{


    //Class 'Car' must either be declared abstract or
    // implement abstract method 'go()' in 'Vehicle

    //after declaring an abstract class in the abstract superclass:
    //Vehicle we recieve the above error, telling us that we need to override
    // and implement the go method we declared in the Vehicle class


    @Override
    void go() {
        System.out.println("The driver is driving the car ");

    }
}
