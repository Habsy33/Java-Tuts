public class Main {
    public static void main(String[] args) {



        // constructor  = special method that is called when an object
        // is instantiated (created)

        Human human = new Human("Rick", 65, 76);
        Human human2 = new Human("Jobby", 25, 84);

        // here we are calling a constructor found in the Human class
        // if we try to run this code without passing arguements, we'll recieve errors
        // we'll pass instances of each of the parameters which we defined in the Human class

        System.out.println(human2.name);

        human2.eat();
        // we are calling our eat method found in the Human class
        human.drink();
    }
}