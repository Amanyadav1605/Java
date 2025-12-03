import java.awt.*;
import java.awt.event.*;
public class TextFieldExample {
 public static void main(String[] args) {
 Frame f = new Frame("TextField Example");

 TextField tf = new TextField("Enter");
 tf.setBounds(100, 100, 150, 30);
 f.add(tf);
 f.setSize(400, 300);
 f.setLayout(null);
 f.setVisible(true);
 }
}
