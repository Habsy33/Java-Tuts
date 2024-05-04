public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;


    }


    // below are overloaded constructors, they have the same name as the original method
    // however they have different parameters, meaning they have unique signatures

    Pizza(String bread, String sauce, String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;


    }

    Pizza(String bread, String sauce){

        this.bread = bread;
        this.sauce = sauce;


    }

    Pizza(String bread){

        this.bread = bread;


    }


}
