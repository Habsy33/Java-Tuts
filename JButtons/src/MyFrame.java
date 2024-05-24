import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("lol poop.png");

        ImageIcon icon2 = new ImageIcon("lol poop.png");

        label = new JLabel();

        label.setIcon(icon2);

        label.setBounds(150, 250, 150, 150);

        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("This is a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 15));
        button.setIconTextGap(-25);
        button.setForeground(Color.red);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createBevelBorder(1));

//        button.setEnabled(false);
        //the above line of code disables a button's functionality
        //if the line is placed within the action performed block of code then
        //the button will work once, after working once it will be disabled


//        button.addActionListener(e -> System.out.println("poo"));
        //above is a more effective way of using the button as an action listener
        //it uses a lambda expression and prints out the string whenever the button is clicked


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           System.out.println("Poo");
           label.setVisible(true);

           //we added a new line of code to the action performed block
           // label is originally not set to visible
           // but in the action performed block, after the button is selected
           // then the label will be visible


       }
    }
}
