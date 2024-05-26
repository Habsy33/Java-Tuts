public class MyGenericClass <Thing extends Number, Thing2 extends Number> {

    //in this example, we are making the generic class a subclass of the Number class
    //meaning only ints and doubles will be accepted by the generic class
    //since we made thing1 and thing2 both extend the numbers class both, parameters must be
    //some type of digit


    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;

    }

    //because we added another parameter Thing2
    //we need to instantiate the generic class in main class
    // we need 2 arguments instead of 1


    public Thing2 getValue(){
        return y;
    }
}
