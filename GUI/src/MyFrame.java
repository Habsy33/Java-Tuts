import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    //we are going to make the MyFrame class a subclass of the JFrame class
    //this will need to be imported as we don't have the class in our folder


    MyFrame(){
        this.setTitle("JFrame Title goes here");

        //this sets the title of the this

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this mehod closes the program after the user closes the window

        this.setResizable(false);
        //stops this from being resizable

        this.setSize(420, 420);

        //.setSize method allows you to specify the size of the intended
        //Jthis (GUI)

        this.setVisible(true);

        //make the this visible


        ImageIcon image = new ImageIcon("lol poop.png");
        //create image icon

        this.setIconImage(image.getImage());
        //change icon this

        this.getContentPane().setBackground(Color.darkGray);
        //changes the colour of the background


        //creating a new class and putting all the code in there is a
        //more organised way of using creating and modifying the Jframe GUI
        //we simply just create a new instance of the MyFrame class to run all
        //of the configurations

    }
}
