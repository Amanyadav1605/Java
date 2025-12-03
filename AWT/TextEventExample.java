import java.awt.*;
import java.awt.event.*;
public class TextEventExample extends Frame implements TextListener {
 TextField tf;
 TextEventExample() {
 tf = new TextField();
 tf.setBounds(100, 100, 150, 30);
 tf.addTextListener(this);
 add(tf);
 setSize(400, 400);
 setLayout(null);
 setVisible(true);
 }
 public void textValueChanged(TextEvent e) {
 System.out.println("Text Changed: " + tf.getText());
 }
 public static void main(String[] args) {
 new TextEventExample();
 }
}