
import java.awt.*;
import java.awt.event.*;

public class KeyPressExample {
    public static void main(String[] args) {
        Frame frame=new Frame("Key Press Examples");
        TextField textfield=new TextField();
        textfield.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e){}
            public void keyPressed(KeyEvent e){}
            public void keyReleased(KeyEvent e){
                System.out.println("Key Released: "+e.getKeyChar());
            }
        });
        frame.add(textfield);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
