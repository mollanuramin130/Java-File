import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class EventHandling extends Applet implements ActionListener{
    Button b1= new Button("click me");
    String str= "";
    public void init(){
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(str, 20, 50);
    }
    public void actionPerformed(ActionEvent e){
        str ="Button clicked";
        repaint();
    }
}
