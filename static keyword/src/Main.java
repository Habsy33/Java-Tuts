public class Main {
    public static void main(String[] args) {
        // static  = modifier. A single copy of a viarable / method is created and shared
        // the class "owns" the static member

        //for example see class Friend >>


        Friend friend1 = new Friend("Deez");
        Friend friend2 = new Friend("Deeznuts");
        System.out.println(Friend.numberOfFriends);

        //we are creating new objects of the Friend class and passing some strings as the argumentd
        // we have a print line statement which will print the number of friends. using the variable numberOfFriends which we created in the friend class
        // we created two objects so we should have 2 friends printed below:

        Friend.displayFriends();

        //this is how we display friends using a method created in the friend class
        // here we are just calling the method.


    }
}