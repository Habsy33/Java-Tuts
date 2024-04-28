public class Main {
    public static void main(String[] args) {

        //wrapper class = provides a way to use primitive data types as reference data types
        // basically turning primitive data types (int, boolean) to a reference data types (array)

        // reference data types contain useful methods
        // can be used with collections (ex.ArrayList)

        //primitive                //wrapper
        //----------              //---------
        // boolean                // Boolean
        // char                   // Character
        // int                    // Integer
        // double                 // Double


        //autoboxing  = the automatic conversion that the java compiler makes between the primitive
        // data types and their corresponding object wrapper class


        //unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive data type.

        // see autoboxing example below:

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Habeeb";

        //the advantage of using wrapper classes means that primitive data types can be used as reference data types which
        // means that they have access to all the reference data type methods.

        // see unboxing example below:

        if(a==true){
            System.out.println("This is true");

        }

        //in this example the reference data type can still be used as if it were a primitive data type (this is the case for all wrapper classes)


        //primitive data types vs Wrapper classes:

        int x = 5;

        //wrapper classes:
        Integer y = new Integer(5); //

        System.out.println(y);

        //this is why primitive data types are seen as faster than wrapper classes
    }
}
