import java.awt.*;
import java.awt.event.*;

public class EventDemo {

    public static void main(String[] args) {

        // Create a frame.
        Frame frame = new Frame("Event Demo");

        // Create a button.
        Button button = new Button("Click Me");

        // Add a listener to the button.
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Do something when the button is clicked.
                System.out.println("Button clicked!");
            }
        });

        // Add the button to the frame.
        frame.add(button);

        // Set the frame's size and location.
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        // Display the frame.
        frame.setVisible(true);
    }
}
