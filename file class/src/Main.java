import java.io.File;

public class Main {
    public static void main(String[] args) {

        //file = an abstract representation of file and directory pathnames

        //in this tutorial we use java to detect if we have files in certain locations


        File file = new File("secret_message.txt");


        //we are creating a new file object using an import of the File class
        // this object allows us to pass a files pathname as an arguement
        //and we can create an if statement to handle the logic of determining whether the file exists or not


        if(file.exists()){
            System.out.println("Your file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile());
            file.delete();
            //.getPath method prints the file path specified in the constructor
            //.getAbsolutePath method prints the complete path within local computer
            //.isFile method returns a true or false on whether the specified file is indeed a file
            //the .delete method deletes the file in the specified constructor



        }

        //we create an if statement which (using the file objects .exists method) determines whether thhe file exists
        //if it does exist the line will be printed
        //if not the else statement will be triggered and that line will be printed instead

        else{
            System.out.println("That file doesn't exist :( ");
        }



    }
}