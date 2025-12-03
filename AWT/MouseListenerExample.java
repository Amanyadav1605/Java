import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener{
 Label label;
 MouseListenerExample() {
 label = new Label();
 label.setBounds(20, 50, 250, 30);
 add(label);
 addMouseListener(this); // Register MouseListener
 setSize(400, 300);
 setLayout(null);
 setVisible(true);
 }
 public void mouseClicked(MouseEvent e) {
 label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
 }
 public void mousePressed(MouseEvent e) {
 label.setText("Mouse Pressed");
 }
 public void mouseReleased(MouseEvent e) {
 label.setText("Mouse Released");
 }
 public void mouseEntered(MouseEvent e) {
 label.setText("Mouse Entered the frame");
 }
 public void mouseExited(MouseEvent e) {
 label.setText("Mouse Exited the frame");
 }
public static void main(String[] args)
{
new MouseListenerExample();
}
}
