import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Steps to Deserialize
        // -------------------------------------------------------------
        // 1. Declare your object (don't instantiate)
        // 2. Your class should implement Serializable interface
        // 3. add import java.io.Serializable;
        // 4. FileInputStream fileIn = new FileInputStream(file path);
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6. objectName = (Class) in.readObject();
        // 7. in.close(); fileIn.close();


        User user = null;
        //^^ this is how to declare without instantiating

        FileInputStream fileIn = new FileInputStream("C:\\Users\\holuy\\Desktop\\github stuff\\Java-Tuts\\serialisation\\UserInfo.ser");
        // in the line above we are specifying the .ser file we want to deserialize
        ObjectInputStream in = new ObjectInputStream(fileIn);
        // we are declaring an objectInputStream class to recieve the objects found in the .ser file
        user = (User) in.readObject();
        // we are stating that we want the user object which is instantiated from the User class
        in.close();
        // we are closing the "in" method
        fileIn.close();
        // we are closing the fileIn method


        //we are demonstrating that we have access to the .ser file created from the serializer project
        //if we didn't have access the following methods would not work.

        System.out.println(user.name);

        System.out.println(user.password);

        user.sayHello();


    }
}