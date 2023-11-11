
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField(20);
        JPasswordField passField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the username and password from the text fields.
                String username = userField.getText();
                String password =passField.getText();

                // Check if the username and password are valid.
                if (username.equals("admin") && password.equals("admin")) {
                    // Login successful.
                    frame.dispose();
                    System.out.println("Login successful!");
                } else {
                    // Login failed.
                    System.out.println("Login failed!");
                }
            }
        });
        frame.setLayout(new GridLayout(3, 2));
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

