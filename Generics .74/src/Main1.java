//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Main1 {
//    public static void main(String[] args) {
////        MyIntergerClass myInt = new MyIntergerClass(1);
////        MyDoubleClass myDouble = new MyDoubleClass(1.1);
////        MyCharacterClass myChar = new MyCharacterClass('%');
////        MyStringClass myString = new MyStringClass("peanuts");
////
////        System.out.println(myInt.getValue());
////        System.out.println(myDouble.getValue());
////        System.out.println(myChar.getValue());
////        System.out.println(myString.getValue());
//
//
//        //this is how we would do it if we were to make seperate classes for each of the get value methods
//
//        //the more efficient way (using generics) involves the following:
//
//
//        MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1, 8);
//        MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(1.1, 2.2);
//        MyGenericClass <Character, Character> myChar = new MyGenericClass<>('^', '*');
//        MyGenericClass <String, Character> myString = new MyGenericClass<>("peanuts", 'y');
//
////        ArrayList <String> myFriends = new ArrayList<>();
//
////        HashMap<Integer, String> users = new HashMap<>();
//
//        //for example arrayList is a generic container, which allows us to
//        //contain any type of data / reference type within it due to its
//        //generic disposition
//
//        //Hashmap works in a similar way to our tut above, it takes two parameters (Key, Value)
//        // and uses those in its methods and attributes
//
//
//
//
//
//        System.out.println(myInt.getValue());
//        System.out.println(myDouble.getValue());
//        System.out.println(myChar.getValue());
//        System.out.println(myString.getValue());
//
//        //this may seem the same but, instead of having 4 individual classes
//        //we have one generic class, that passes "thing" as a parameter and allows
//        //all reference types to use its methods and attributes
//        //with x as a placeholder for the reference type
//
//
//
//
//
//    }
//}
