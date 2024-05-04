public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2024;


    // we are going to override the toString method, as it currently prints the location of the "car" objects location
    // instead of just printing the car object's attributes

    public String toString(){
        //modifying the toString method

        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;


        // we are defining a function within the toString method, where the all the attributes of the car object
        // are printed and returned.


    }


}
