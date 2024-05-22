import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JPanel = a GUI component that functions as a
                  // container to hold other components

        ImageIcon icon = new ImageIcon("lol poop.png");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT) ;



        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);


        JFrame frame = new JFrame();;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700, 750);
        frame.setVisible(true);

        //since we've set the image and label to the size of the frame we can comment the aboe out

        bluePanel.add(label); //this line of code sets the icon to a particular panel
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);



    }
}