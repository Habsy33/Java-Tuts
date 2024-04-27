import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // nested loops = a loop inside of a loop

        Scanner scanner  = new Scanner(System.in);
        int rows; //declaring variables
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use ");
        symbol = scanner.next();


        //outer loop
        //j comes after i so that's our new index (can be anything)

        for (int i=1; i<=rows; i++){
            System.out.println();
            //nested loop
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);

            }
        }
    }
            // Outer Loop (for loop):
    //The outer loop is responsible for iterating over each row of the grid.
    //It runs rows number of times, where rows is the number of rows specified by the user.
    //For each iteration of the outer loop, the inner nested loop executes.
    //Nested Loop (for loop inside the outer loop):
    //The nested loop is responsible for iterating over each column within a row.
    //It runs columns number of times for each iteration of the outer loop, where columns is the number of columns specified by the user.
    //For each iteration of the nested loop, the symbol chosen by the user is printed.
}