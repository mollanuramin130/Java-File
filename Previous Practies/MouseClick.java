
import java.awt.event.*;
import java.awt.*;

public class MouseClick {
    public static void main(String[] args) {
        Frame frame=new Frame("Mouse Click Example");
        Panel panel = new Panel();
        panel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse Clicked at ("+e.getX()+","+e.getY()+")");
            }
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){} 
        });
        frame.add(panel);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
