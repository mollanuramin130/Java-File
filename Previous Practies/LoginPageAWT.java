
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPageAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Login Page");
        Label userLabel = new Label("Username:");
        Label passLabel = new Label("Password:");
        TextField userField = new TextField(20);
        JPasswordField passField = new JPasswordField(20);
        Button loginButton = new Button("Login");
        
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
                    JOptionPane.showMessageDialog(frame, "Welcome, " + username);
                } else {
                    // Login failed.
                    System.out.println("Login failed!");
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });
        frame.setLayout(new GridLayout(3, 2));
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

