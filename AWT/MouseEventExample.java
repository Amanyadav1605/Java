import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener {
 Label label;
 MouseEventExample() {
 label = new Label();
 label.setBounds(20, 50, 200, 30);
 addMouseListener(this);
 add(label);
 setSize(300, 300);
 setLayout(null);
 setVisible(true);
 }
 public void mouseClicked(MouseEvent e) {
 label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
 }
 public void mouseEntered(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
 public void mousePressed(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public static void main(String[] args) {
 new MouseEventExample();
 }
}