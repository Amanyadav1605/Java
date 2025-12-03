import java.awt.*;
import java.awt.event.*;
public class ButtonClickExample extends Frame implements ActionListener {
 Button b;
 ButtonClickExample() {
 b = new Button("Click Me");
 b.setBounds(100, 100, 80, 30);
 b.addActionListener(this); // Register the listener
 add(b);
 setSize(300, 300);
 setLayout(null);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
 b.setLabel("Clicked");
 }
 public static void main(String[] args) {
 new ButtonClickExample();
 }
}