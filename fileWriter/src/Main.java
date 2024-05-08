import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //in this tutorial we are going to learn to write to a file in java
        try{
        FileWriter writer = new FileWriter("poem.txt");
        writer.write("Roses are red \n violets are blue \n nyash, booty, gyatt, bunda, ass");
        writer.append("\n (a poem made by a real ni55a)");
        writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
}