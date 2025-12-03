import java.awt.*;
public class CanvasExample extends Canvas {

 public void paint(Graphics g) {
 g.setColor(Color.red);
 g.fillOval(75, 75, 100, 100);
 }
 public static void main(String[] args) {
 Frame f = new Frame("Canvas Example");
 CanvasExample c = new CanvasExample();
 c.setSize(250, 250);
 f.add(c);
 f.setSize(400, 400);
 f.setLayout(null);
 f.setVisible(true);
 }
}
