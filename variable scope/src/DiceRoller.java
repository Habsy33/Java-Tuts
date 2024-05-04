import java.util.Random;

public class DiceRoller {

    Random random;
    int number;

    // these are declared outwith any method meaning they are global
    // (can be accessed by any method within the class)
    DiceRoller(){

        random = new Random();
//        int number = 0;
        roll();

        // this will be our constructor for the DiceRoller class
        // within the diceroller constructor we declared the variables
        // however, the variables number and random are both local only to the
        // constructor, so we comment out the declared variables in the constructor
        // and instead declare them outwith all of the methods, this way whey can be accessible
        // within the class

    }

    void roll(){

        number = random.nextInt(6) + 1;
        System.out.println(number);

        //this is one of the methods of the DiceRoller class

    }
}
