import java.awt.*;
public class PanelExample {
 public static void main(String[] args) {
 Frame f = new Frame("Panel Example");
 Panel p = new Panel();
 p.setBounds(50, 50, 200, 100);
 p.setBackground(Color.lightGray);
 Button b1 = new Button("OK");
 Button b2 = new Button("Cancel");
 p.add(b1);
 p.add(b2);
 f.add(p);
 f.setSize(400, 300);
 f.setLayout(null);
 f.setVisible(true);
 }
}