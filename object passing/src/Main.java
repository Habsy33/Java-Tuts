public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car  =  new Car("BMW");
        Car car1  =  new Car("Audi");

        // we are creating instances of both classes
        // in this tutorialwe are going to demonstrate how we will pass
        // objects as parameters in classes



        garage.park(car1);

    }
}