public class Main {
    public static void main(String[] args) {


        // object is an instance
        //class = template for defining objects
        // an object is an instance of a class that may cocntain attributes and methods
        // example of objects: (phone, pen, laptop, football)
        //object uses classes
        //example of classes: (car, school, championship)

        // you can keep different classes in the same or different .java files
        // if you want to keep the different classes in the same .java file- the class code
        // must be outwith the other classes (main class in this example)




        Car myCar = new Car();

        Car myCar2 = new Car();
        // creating a new object from the Car class to demonstrate that you can
        // make unlimited objects of the class, and will have access to all the methods
        // and attributes associated with the class


//        System.out.println(myCar.make);
//        System.out.println(myCar.model);
//        System.out.println(myCar2.year);
//        System.out.println(myCar2.color);

        // above is how we construct an insance of the car class
        // the structure follows:
        // class name object name = new class name();
        // in our print line statement we are using one of the attributes of the Car class

//        myCar.drive();

        //above is how we call the drive method of the Car class whose object name is "myCar"

           myCar.brake();

           //above is how we call the brake method of the Car class whose object is named "myCar"

//            myCar2.drive();

    }
}