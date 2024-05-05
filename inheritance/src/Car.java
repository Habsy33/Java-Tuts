public class Car extends Vehicle{

    //above is how we share the variables and methods from other classes
    //we use the extends keyword and declare the class which contents we want to inherit

    //when we do this- the Car class and Vehicle class will now become sub classes of the Vehicle class

    // subclasses - Car & Bicycle aka child classes
    // super class - Vehicle aka parent classes


    int wheels = 4;
    int doors = 4;

    // all the code within this class will not be shared with other classes
    //the added benefit of inheritance is that the Car class can inherit basic
    //attributes and methods, but can add class-specific code
}
