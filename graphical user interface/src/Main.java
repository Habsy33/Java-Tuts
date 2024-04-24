import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name  = JOptionPane.showInputDialog("Enter your name innit bruv");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your name is " + name + " and you are " + age + "years old.");

        double hieght = Double.parseDouble(JOptionPane.showInputDialog("Enter your hieght"));
        JOptionPane.showMessageDialog(null, "So Bacially, your name is " + name + " and you are " + age + "years old, and " + hieght + " cm tall.");
    }
}