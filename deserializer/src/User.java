import java.io.Serializable;

public class User implements Serializable {

    String name;
    String password;

    public void sayHello(){

        System.out.println("Hello " + name);

    }


    //Notes:
    //  1. Child classes of a parent class that implements Serializable
    //  will also be serializable.
    //  2. static fields are not serialized (they belong to the class, not
    //  an individual object).
    //  3. the class's definition ("class file") itself is not recorded
    //  will need to cast it as the object type.
    //  4. fields declared as "transient" aren't serialised, they're ignored
    //  5. serialVersionUID is a unique version ID. kinda similar to method signature / hashing
    //  6. This is why you need to make sure the deserializer project has the same
    //  class, object and attribute names as the serializer project.
    //  Or else the serialVersionUID won't match up.

}
