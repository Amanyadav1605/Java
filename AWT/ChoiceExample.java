import java.awt.*;
import java.awt.event.*;
public class ChoiceExample {
 public static void main(String[] args) {
 Frame f = new Frame("Choice Example");
 Choice c = new Choice();
 c.setBounds(100, 100, 100, 30);
 c.add("C++");
 c.add("Java");
 c.add("Python");
 f.add(c);
 f.setSize(300, 200);
 f.setLayout(null);
 f.setVisible(true);
 }
}