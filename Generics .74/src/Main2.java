public class Main2 {

        public static void main(String[] args) {

            //bounded types = you can create the objects of a generic class to have data
            //of specific derived types ex.Number


            MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1, 8);
            MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(1.1, 2.2);

            System.out.println(myInt.getValue());
            System.out.println(myDouble.getValue());

            //in this example, we are making the generic class a subclass of the Number class
            //meaning only ints and doubles will be accepted by the generic class
            //since we made thing1 and thing2 both extend the numbers class both, parameters must be
            //some type of digit




        }
    }
