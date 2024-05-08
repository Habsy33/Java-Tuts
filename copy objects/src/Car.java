public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }

    Car(Car x){
        this.copy(x);

    }

    //using overloaded constructors, we can create another Car constructor
    //which instead passes an object as its parameter
    //and uses the copy method we created below, to copy the attributes of an object
    //using the selected object


    //as it is the attributes are private meaning they aren't accessible outside of this class
    //if we want to keep the attributes as private but still be able to access them
    //we need getter methods:

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    //these are getter methods, they consist of declaring a public method
    // and returning the attributes which we want to make accessible.


    public void setMake(String make){
        this.make =make;
    }
    public void setModel(String model){
        this.model =model;
    }
    public void setYear(int year){
        this.year =year;
    }

    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

        //basically what we're doing is setting the object that we want to copy from
        //to the object that is a copy, passing the target object as an arguement in the main method

        //in order to do that, we need to retrieve the attributes as they are private
        //the getter methods are useful for that


    }





}
