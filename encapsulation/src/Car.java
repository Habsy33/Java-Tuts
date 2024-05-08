public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//
        //we comment the above code out, because we have created set methods which
        //are more effective, and allow the private attributes of the car object to be changed
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }

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





}
