public class Main {
    public static void main(String[] args) {

        // printf() = an optional method to control,format, and display text to the console window
        // the printf method requires two arguements  = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format string %d", 123);

        // if we want the value at the end of our format string to show in our console window we will use the percentage symbol
        // this is % symbol acts as a format specfier
        // we want to display a decimal number we use d after the % symbol.
        // you can add the format specifier "%d" anywhere within the printf statement

        System.out.printf("%d - This is another format string", 123);

        boolean myBoolean = true;
        char myChar = '*';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // conversion characters - these are letters that follow the format specifier
//        System.out.printf("%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);


        // these are examples of how we can place our format string and variable / values / objects and our format specifiers
        // in these examples the format specifiers are % d, b, c, s, f


        //Width  - minimum number of characters to be written as output
        // the width is placed before the conversion character
        System.out.printf("Hello %10s", myString);


        //Precision - sets number of digits of precision when occuring floating-point values
        // example;

//        System.out.printf("You have this much money %.2f", myDouble);

        //.2 means the float will print out until 2 places after decimal point

        //flags
        // adds an effect to the output based on the flag added to the format specifier
        // examples;

        //        System.out.printf("Hello %-10s", myString); - left or right justify the format string
        //        System.out.printf("You have this much money %+f", myDouble); - outputs whether the decimal is positive or negative
        //        System.out.printf("You have this much money %020f", myDouble); - surround the output with 0's
        //        System.out.printf("You have this much money %,f", myDouble); - group the numbers if over 1000.

    }
}