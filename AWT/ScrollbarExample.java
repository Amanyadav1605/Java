import java.awt.*;
import java.awt.event.*;
public class ScrollbarExample {
 public static void main(String[] args) {
 Frame f = new Frame("Scrollbar Example");
 Scrollbar s = new Scrollbar();
 s.setBounds(100, 100, 20, 100);
 f.add(s);
 f.setSize(800, 450);
 f.setLayout(null);
 f.setVisible(true);
 }
}