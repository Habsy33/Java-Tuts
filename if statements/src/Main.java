public class Main {
    public static void main(String[] args) {


        // if statement = performs a block of code if it's condition evaluates to be true

        int age = 15;

        if(age==75) {             //bascially the if statement checks a condition
            System.out.println("Ok boomer");
        } else if (age==18) {  //else if means that if the first condition is not met, there's another if statement
            System.out.println("You are an adult");

        } else if (age>= 13) {
            System.out.println("Your balls aint even drop yet, you're a teenager");

        } else {  //if the "if" or "else if " conditions haven't been met the else block of code will be ran instead.
            System.out.println("You aint no adult, you a kid hahaaa");
        }
    }

    //once any of the "if" statements are met the rest of the conditions will be skipped.
}