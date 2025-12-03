import java.awt.*;
import java.awt.event.*;

public class WindowEventExample extends Frame {
 WindowEventExample() {
 setSize(300, 300);
 setLayout(null);
 setVisible(true);
 addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 System.out.println("Window Closing...");
 dispose();
 }
 });
 }
 public static void main(String[] args) {
 new WindowEventExample();
 }
}