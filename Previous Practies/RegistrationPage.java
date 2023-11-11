
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationPage {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Page");
        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameTextField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailTextField = new JTextField();
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = usernameTextField.getText();
                String password = String.valueOf(passwordField.getPassword());
                String email = emailTextField.getText();

                if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
  
                    JOptionPane.showMessageDialog(frame, "Please enter all the required fields.");
                } else {
                
                    System.out.println("User registered successfully.");
                    JOptionPane.showMessageDialog(frame, "User registered successfully.");
                }
            }
        });
        frame.add(usernameLabel);
        frame.add(usernameTextField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(emailLabel);
        frame.add(emailTextField);
        frame.add(submitButton);
        frame.setLayout(new GridLayout(3, 2));
        frame.pack();
        frame.setVisible(true);
    }
}