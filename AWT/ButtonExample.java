import java.awt.*;
import java.awt.event.*;
public class ButtonExample {
 public static void main(String[] args) {
 Frame f = new Frame("Button Example");
 Button b = new Button("Click Me");
 b.setBounds(100, 100, 80, 30);
 b.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 System.out.println("Button Clicked!");
 }
 });
 f.add(b);
 f.setSize(300, 200);
 f.setLayout(null);
 f.setVisible(true);
 }
}
