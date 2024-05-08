public class Fish implements Prey,Predator{
    // we are going to make fish use both prey and predator interfaces

    @Override
    public void hunt() {
        System.out.println("The fish is hunting smaller fish");

    }

    @Override
    public void flee() {
        System.out.println("The fish is fleeing from a larger fish");

    }


}
