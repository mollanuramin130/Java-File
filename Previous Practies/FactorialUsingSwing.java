import javax.swing.*;
public class FactorialUsingSwing {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("Enter Your number");
        int number=Integer.parseInt(input);
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        JOptionPane.showMessageDialog(null, "Factorial value of "+number+" is "+fact);
    }
}
