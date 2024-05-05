package package2;

import package1.*;

public class Asub extends A {


    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.defaultMessage);

        //because the variable defaultMessage is within the same package as
        //the Asub class. We have access to the variable and can call it


        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);

        //the Asub class has access to the protectedmessage variable as it's a subclass
        //of class A.
    }
}
