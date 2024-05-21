import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //we could have used try and catch blocks to handle the possible errors in this type of application, however the above line of code
        //is a simpler much more effect way of handling them

        //in this tutorial we are learning how to play audio clips
        //we start off by creating a few new objects: scanner (for user input), file (to access .wav audio file), audioInputStream (to hear the music)
        //clip (to control the music i.e. stop start etc)

        Scanner scanner = new Scanner(System.in);

        File file = new File("Masquerade - Luna Cantina.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);



        String response = "";

        //we set the user response to nothing at the moment

        while(!response.equals("Q")){
            System.out.println("P - play, S - stop, R - reset, Q - quit");
            System.out.println("Enter your choice: ");

            //using a while loop we declare that:
            //when the response is not equal to Q, the following options will be available to the user, in a print statement


            response = scanner.next();
            response = response.toUpperCase();
            //When the user enters a response then the scanner collects that input and the switch code is executed
            //incase the user doesn't use capitals we will convert all inputs to capital

            switch(response){
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                    break;
                case("Q"): clip.close();
                    break;
                default: System.out.println("Not a valid response");


                //the way a switch statement works is by taking the response as a parameter
                    //and creating "cases" instructions to execute in event of that case
                    //in case P, the clip's .start method is triggered and the audio will play
                    //break; statements are required in order to end the switch block and the scanner
                    // will ask the user for another input
                    //default: is used in the event that none of the cases are triggered, in our example we can see
                    //the a print statement saying the response wasn't valid is printed for the user

            }

        }
        System.out.println("Bye");
        //this print statement is outwith the switch block, and once the .close method has been triggered, the line here is ran
        //before completely closing the program




    }
}