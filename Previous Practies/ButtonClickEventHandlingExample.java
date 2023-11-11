
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class ButtonClickEventHandlingExample {
    public static void main(String[] args) {
       Frame frame=new Frame("Button Click Examples");
       Button button2=new Button("Click Me");
       button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            System.out.println("Button Clicked");
        }
       });
       frame.add(button2);
       frame.setSize(1000,300);
       frame.setVisible(true);
}
}