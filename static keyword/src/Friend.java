public class Friend {
    String name;

    static int numberOfFriends;

    // we declare a new variable "numberOfFriends" as static, this means
    // it's the only copy of its variable, and will be shared by all instances of the class
    // because it's global not a local variable

    // if we remove "static" keyword from numberOfFriends we will see that the
    //objects each individually have their own copy of the numberOfFriends variable
    //meaning that we can't effectively count how many friends there are
    // static allows us to make only one copy which all the objects will share



    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }
    //in the constructor above, we are passing the String name as a parameter for the objects
    // we are setting the object name to the name variable
    // and we are incrementing the variable numberOfFriends each time a new friend is added.
    // we aren't only incrementing, we are just counting how many friend objects have been created

    static void displayFriends(){
        System.out.println("You have " +numberOfFriends +  " friends");
    }
}
