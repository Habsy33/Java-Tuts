import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        // Serialisation = process of conveting an object into a byte stream.
        // Persists (saves the state) the object after program exits
        // This byte stream can be saved as a file or sent over a network
        // can be sent to a different machine
        // Byte stream can be saved a file (.ser) which is platform independent
        // (Think of this as if you're saving a file with the object's information)

        //De-serialisation = The reverse process of converting a byte stream into an object
        // (Think of this as loading a saved file)



        User user = new User();
        user.name = "Bro";
        user.password = "I<3Pizza";

//        user.sayHello();
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        // we are specifying the name of the .ser file with we want the object data to be in
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //sending object data out of this project
        out.writeObject(user);
        // wtiting the object data into byte code for the .ser file
        out.close();
        //closing the out method used to export
        fileOut.close();
        //closing the fileOut method

        System.out.println("Object info has been saved! :)");

        //   Steps to serialise
        //   -----------------------------------------------------------------------------
        //   1. Your object class should implement serializable interface
        //   2. add import java.io.Serializable;
        //   3. FileOutputStream fileOut = new FileOutputStream(file path.ser);
        //   4. ObjectOutputStream out = new ObjectOutputStream(file out);
        //   5. out.writeObject(objectName)
        //   6. out.close(); fileOut.close();
    }
}