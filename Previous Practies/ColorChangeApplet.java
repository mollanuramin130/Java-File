import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChangeApplet extends JApplet implements ActionListener {

    JButton redButton, greenButton, blueButton;
    Color backgroundColor = Color.white;

    public void init() {

        // Create the buttons.
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");

        // Set the action listeners for the buttons.
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        // Add the buttons to the applet.
        add(redButton);
        add(greenButton);
        add(blueButton);
    }

    public void actionPerformed(ActionEvent e) {

        // Get the button that was pressed.
        JButton button = (JButton) e.getSource();

        // Change the background color to the color of the button that was pressed.
        if (button == redButton) {
            backgroundColor = Color.red;
        } else if (button == greenButton) {
            backgroundColor = Color.green;
        } else {
            backgroundColor = Color.blue;
        }

        // Set the background color of the applet.
        repaint();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Fill the applet with the background color.
        g.setColor(backgroundColor);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}