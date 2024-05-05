public class Main {
    public static void main(String[] args) {
        // method overriding = declaring a method in a sub class
        //which is already present in a parent class
        // this is done so that a child class can give it's own implementation
        //based on its requirements



        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();

        //when both of these methods are called you will see different outputs

    }
}