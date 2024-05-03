public class Human {

    String name;
    int age;
    double weight;
    Human(String name, int age, double weight){

//        name = name;
//        age = age;
//        weight = weight;

        // this is not the correct way to assign the values to the variables
        // if we do it this way, the attributes of the Human class will return "null"

        // to assign the values to the variables we will use the "this" variable:

           this.name = name;
           this.age = age;
           this.weight = weight;

           // imagine that when a new object of the Human class is created in the main method,
            // we are "replacing" "this" attribute with the given attribute in the object instanciation.

    }
    //above is a demonstration of a constructor in our "Human" class
    // within the constructor we are going to assign the values to each of these variables

    void eat(){
        System.out.println(this.name + " Is eating rn");
    }

    void drink(){
        System.out.println(this.name + " Is drinking rn");
    }

    // with regards to methods, in order to retrieve the object within it's own class we use
    // the "this" keyword, here we can set the object to a print line statement when the eat method is called

}
