import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //while loop = executes a block of code as long as it's condition remains true

        // like an if statement but will continue looping through code as long as the conidition remains true.

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // set string name to nothing so that the user can set a new name

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

        }while(name.isEmpty());

        //do loop means that the while loop will be ran at least once, regardless of any conditions.

        System.out.println("Hello " + name);
    }
}