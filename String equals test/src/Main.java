import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //String = a reference data type that can store one or more characters
        //            and reference data types have access to useful methods

        String name = "Huncho";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name? ");
        String response = scanner.next();

        if(response.equals(name) && !response.equals("")){
            System.out.println("There can only be one Huncho");
        }
        else{
            System.out.println("Boring, who asked???");
        }

////        boolean result = name.equals("Huncho");
//
//        System.out.println(result);
    }
}