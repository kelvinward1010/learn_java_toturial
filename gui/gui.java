package gui;
import javax.swing.JOptionPane;;

public class gui {
    public static void main(String[] args){
        String action = JOptionPane.showInputDialog("What do you want to do? ");
        JOptionPane.showMessageDialog(null, "I'll be " + action);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
        JOptionPane.showMessageDialog(null, "You are: " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height? "));
        JOptionPane.showMessageDialog(null, "You heght: " + height + " metters");
    }
}
