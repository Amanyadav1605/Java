import java.awt.*;
import java.awt.event.*;
public class CheckboxExample {
 public static void main(String[] args) {
 Frame f = new Frame("Checkbox Example");
 Checkbox cb1 = new Checkbox("Java");
 cb1.setBounds(100, 100, 80, 30);
 Checkbox cb2 = new Checkbox("Python");
 cb2.setBounds(100, 130, 80, 30);
 f.add(cb1);
 f.add(cb2);
 f.setSize(300, 250);
 f.setLayout(null);
 f.setVisible(true);
 }
}