public class Main {
    public static void main(String[] args) {

        // method = block of code that is executed whenever it is called upon

        // main method is an example of method

        int x = 3;
        int y = 4;


        System.out.println(add(x,y));
        // in order to call the add method we need to pass in two arguements which will be 2 integers
    }

    static int add(int x, int y){


        return x + y;
    }
    // normally we'd specify void if we're not returning anything
    // if we want to return something we'll specify the return type


    // this example is a slightly more complicated version of just doing the following:
    // int x = 4; int y = 3;
    // System.out.println(x + y);

    // the advantage of creating a new method outside of the main method is that if we have a complex program
    // we might want to do this addition multiple times without having to repeat the x + y line each time.



}