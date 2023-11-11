
import javax.swing.*;
import java.awt.event.*;

public class CourseSelected {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Course Selection");
        
        JComboBox<String> courseDropdown = new JComboBox<>(new String[]{"Math", "Science", "English", "History"});
        JTextField selectedCourseField = new JTextField(15);
        JButton showButton = new JButton("Show Selected");
        
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCourse =
                       (String)courseDropdown.getSelectedItem();
                selectedCourseField.setText(selectedCourse);
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(courseDropdown);
        panel.add(showButton);
        panel.add(selectedCourseField);
        
        frame.getContentPane().add(panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
