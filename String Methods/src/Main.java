public class Main {
    public static void main(String[] args) {

        //String = a reference data type that can store one or more characters
        //            and reference data types have access to useful methods

        String name = " Huncho";
        //boolean result = name.equalsIgnoreCase("Huncho");

//        int result = name.length();
//        char result = name.charAt(0);

//        int result = name.indexOf("ch");
//        boolean result = name.isEmpty();

//        String result = name.toUpperCase();
//        String result = name.toLowerCase();

//        String result = name.trim();

        String result = name.replace('o', 'r');

        System.out.println(result);
    }
}