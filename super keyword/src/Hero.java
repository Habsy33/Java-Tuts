public class Hero extends Person{

    String power;

    Hero(String name, int age, String power){
        super(name, age);
//        this.name = name;
//        this.age = age;
        this.power = power;

        //the commented out code is how we usually construct
        //however using the super keyword we use the predefined name and age variables
        // and we can set the object to these attributes.

        //we can also use the super keyword to use predefined methods from the superclass



        // we used name and age from the Person class, however
        //in our Hero class we haver the attribute power
        //so we can set the object's power to the power variable
        // specifying this is another class specific attribute meaning the
        //Person class doesn't have a .power field




    }

    public String toString(){
        return super.toString() + this.power;
    }
    //we override the toString method we created in the superclass
    //using the super keyword again
    //we can use the to string method defined already in the Person class
    //since the original Person class does not have a power attribute
    //we simply add it after the toString method


}
