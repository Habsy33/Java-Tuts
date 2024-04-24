public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y = "Kool-Aid";
        String temp; //basically means null

        temp = x; //assign temp variable to x i.e. "water"
        x = y; //assign x to the value y
        y = temp; //assign y to the value of the temp variable

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}