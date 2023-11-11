import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("BorderLayoutDemo");

        // Create a JPanel and set its layout to BorderLayout.
        JPanel panel = new JPanel(new BorderLayout());

        // Add a JLabel to the NORTH region of the panel.
        panel.add(new JLabel("North"), BorderLayout.NORTH);

        // Add a JTextField to the CENTER region of the panel.
        panel.add(new JTextField(), BorderLayout.CENTER);

        // Add a JButton to the SOUTH region of the panel.
        panel.add(new JButton("South"), BorderLayout.SOUTH);

        // Add a JTextArea to the WEST region of the panel.
        panel.add(new JTextArea(), BorderLayout.WEST);

        // Add a JList to the EAST region of the panel.
        panel.add(new JList(), BorderLayout.EAST);

        // Add the panel to the JFrame.
        frame.add(panel);

        // Set the JFrame's size and make it visible.
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
