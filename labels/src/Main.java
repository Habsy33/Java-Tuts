import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //JLabel = a GUI display area for a string of text
        //an image, or both.

        JLabel label = new JLabel();
        label.setText("Bro do you even code");

        JFrame frame = new JFrame();;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}