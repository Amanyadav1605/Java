import java.awt.*;
public class AWTExample {
 AWTExample() {
 Frame f = new Frame("AWT Example"); // Create a frame
 Label l = new Label("Enter Name:"); // Create label
 l.setBounds(50, 50, 100, 30);
 TextField tf = new TextField(); // Create text field
 tf.setBounds(160, 50, 150, 30);
 Button b = new Button("Submit"); // Create button
 b.setBounds(120, 100, 80, 30);
 f.add(l);
 f.add(tf);
 f.add(b);
 f.setSize(400, 300);
 f.setLayout(null); // No layout manager
 f.setVisible(true);
 }
 public static void main(String[] args) {
 new AWTExample();
 }
}