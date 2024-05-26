public class Main {
    public static void main(String[] args) {

        //generics = enable types (classes and interfaces) to be parameters when defining:
        // classes, interfaces and methods
        // a benefit is to eliminate the need to create multiple versions of the same class / method
        // for various data types (as we did for overloaded methods)
        // basically we're using 1 version for all reference data types


        Integer[] intArray = {1,2,3,4,5};
        Double [] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character [] charArray = {'H', 'E', 'L', 'L', 'O'};
        String [] stringArray = {"B","Y", "E"};

//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));




    }

    public static <Thing> void displayArray(Thing[] array){
        for(Thing x: array){
            System.out.println(x + "");
        }
        System.out.println();

        //the name of the <> brackets can be anything. It's good practice to use T
        // tut uses "Thing"

        //when the above code is ran, you'll find that the results of using the longer code
        // are the same with this simple addition of a thing class
    }

    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }




    //WHAT WE WOULD NORMALLY DO:

//      public static void displayArray(Double[] array){
//        for(Double x: array){
//            System.out.println(x + "");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(Character[] array){
//        for(Character x: array){
//            System.out.println(x + "");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(String[] array){
//        for(String x: array){
//            System.out.println(x + "");
//        }
//        System.out.println();
//    }




    // the commented out code is how we would usually use a mthod for different data types
    // however there's a more effecient way to do that:





}