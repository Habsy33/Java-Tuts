public class Main {
    public static void main(String[] args) {

        // method = block of code that is executed whenever it is called upon

        // main method is an example of method

        String name = "Bro";
        int age = 21;

        hello(name,age);
        //we can pass a value or a variable to a method when we call it in main method
        // see above
        // the values / variables we're sending through a method are known as argumenets (in the example above "name")

    }

    // we are going to create a new method outside of the main method so we go out of it

    static void hello(String name, int age){
        //anything within the curly braces belongs to the hello method

        // anything within the braces are parameters (list of variables in method declaration)

        // arguments (when calling method) and parameters' (when declaring methods) data type need to match.

        //
        System.out.println("Hello " +name);
        System.out.println("You are "+ age);

        //if we want to call the hello method we should reference it in the main method

        // if we want to call the hello method we need to make it static as we are calling
        // it in main which is a static method.



    }
}