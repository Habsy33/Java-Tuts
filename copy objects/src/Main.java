public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Chevvy", "Camaro", 2022);
//        Car car2 = new Car("Ford", "Fiesta", 2023);

        Car car2 = new Car(car1);

        //this is another way of copying an object, we created overloaded constructors to create a car object
        //that uses other objects as parameters
        //this allows us to pass another object

        //in this tutorial we want to copy opject one into object 2
        //car2 = car1;
        //the reason the above line is a bad idea is that, we are assigning the
        //address of object 2 to object 1.
        //to copy over properly we need to actually create a copy method in the Car class

//        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        //remember this won't print the contents of the objects, it will just print their location

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}