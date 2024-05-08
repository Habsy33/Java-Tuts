public class Main {
    public static void main(String[] args) {

        // Encapsulation = attributes of a class will be hidden or private
        // can be accessed only through methods (getters and setters)
        // you should make attributes private if you don't have a reason to make them public / protected



        Car car = new Car("Chevy", "escador", 2022);

//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);
        //the car object attributes from the Car class are private and cannot be accessed in the main method


//        car.year = 2022;

        //the above line of code wont work because yet again the year attribute is set to private
        //in the code above, we want to change the attribute of our car object
        //we can do this using a setter method:

        car.setYear(2010);

        //we created setter methods, which allow the object's attributes to be changed after initiated
        //even though these attributes are private they can be changed with this line of code above


        System.out.println(car.getMake());
        System.out.println(car.getYear());
        System.out.println(car.getModel());

        //the above lines of code demonstrate how we can use the getter methods defined
        //in the Car class to access private attributes



        //note: the order of the code matters, if you run the print line statements before the
        //.set methods, the object's attribute will be changed but changes won't reflect in the print statement's output


    }
}