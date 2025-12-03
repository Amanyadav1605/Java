import java.awt.*;
import java.awt.event.*;
public class FrameExample {
 public static void main(String[] args) {
 Frame f = new Frame("Frame Example");
 f.setSize(400, 300);

 f.setLayout(null);
 f.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 f.dispose();
 }
 });
 f.setVisible(true);
 }
}
