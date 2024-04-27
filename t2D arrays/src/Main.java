public class Main {
    public static void main(String[] args) {

        //2d array = an array of arrays

        // think of 2d array as having rows and columns

        String[][] cars = new String[3][3];

        // 2 sets of straight brackets, 2 sets of straight brackets instead of 1 in the normal array tutorial.
        // after the equals the array size is set to; 3 arrays and each array will have 3 columns.

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "silverando";
        cars[1][0] = "Mustang";
        cars[1][1] = "corelone";
        cars[1][2] = "Ferrari";
        cars[2][0] = "lambo";
        cars[2][1] = "Dodge";
        cars[2][2] = "tin bucket";

        //setting the values of the rows and columns of the 2d array
        //"row 0 column 0" = "" and so on....
        // not gonna be a [3][0] because we always start from [0][0]

        for(int i = 0; i <cars.length; i++){
            System.out.println();
            // we loop through the index i of the array (bare in mind with 2d arrays we have i and j)
            for(int j = 0; j <cars[i].length; j++){
                System.out.print(cars[i][j] + " ");

                //nested loop loops through the index j of the arrays making sure it doesn't exceed the index i.
                // nested loop then prints the value associated with each column-row pair.
                // the space between " " helps create space between the printed values of the elements in our 2d array.

            }

        }



    }
}