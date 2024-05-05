public class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("The dog goes bark ");
    }

    //here we are modifying a predefined method from the superclass "Animal"
    // we can make the method more specific to the Dog class


    //when overriding a method found in a superclass we can annotate the overriden method with a
    //"@Override" tag - which notifies other users that the method is not original and has been overidden

}
