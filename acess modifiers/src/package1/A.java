package package1;
import package2.*;

public class A {
    public static void main(String[] args) {


        C c = new C();
//        System.out.println(c.defaultMessage);

        //we created a new instance of our class C found in package 2
        //we tried to call it's default message variable however it won't work
        //this is because defaultMessage variable is declared with no
        //access modifiers. This means that its only visible to anything in the same
        //package as it (package 2)

        System.out.println(c.publicMessage);

        //we used the public keyword to declare the variable publicMessage
        //this means this variable can be used by any class in any package

//        B b = new B();
//        System.out.println(b.privateMessage);

        //in the code above we are creating an instance of the class B
        //we are trying to print out its variable privateMessage
        //it wont work as the variable is private and can only be accessed within that class (B)




    }

//    protected String protectedMessage = "This is protected";
//
//    //protected means that the method, variable or class is only visible
//    //to it's subclasses
//
//
//    //protected keyword cannot be within a main method
}
