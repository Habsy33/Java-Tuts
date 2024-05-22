import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JLabel = a GUI display area for a string of text
        //an image, or both.

//        JLabel label = new JLabel();
//        label.setText("Bro do you even code");


        ImageIcon image = new ImageIcon("lol poop.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);


        JLabel label = new JLabel("Bro do you even code"); //this is a similar method
        label.setIcon(image);

        //of doing the setting a label in the example above

        label.setHorizontalTextPosition(JLabel.CENTER); //set text left, centrer
                                                        // or right of image icon

        label.setVerticalTextPosition(JLabel.TOP); //set text top bottom or center of image icon
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set font of text and set font colour of text
        label.setIconTextGap(100); //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background colour
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of both icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of both icon and the text within label

//        label.setBounds(100, 100, 250, 250); //set the x and y positions within the frame and dimensions




        JFrame frame = new JFrame();;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(null);
        //since we've set the image and label to the size of the frame we can comment the aboe out

        frame.setVisible(true);

        frame.add(label);
        //^^ crucial step to add initialised label to frame window
        frame.pack();
        //the above line, sets the image and label to the size of the frame


    }
}