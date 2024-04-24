import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        double x = 3.14;
//        double y = 10;
//
//        double z = Math.ceil(x);
//
//        System.out.println(z);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse would be: "  + z);

        scanner.close();




    }
}