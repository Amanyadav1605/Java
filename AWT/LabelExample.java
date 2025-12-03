//java
//CopyEdit
import java.awt.*;
public class LabelExample {
 public static void main(String[] args) {
 Frame f = new Frame("Label Example");
 Label l1 = new Label("Hello AWT!", Label.CENTER);
 l1.setBounds(50, 100, 200, 30);
 f.add(l1);
 f.setSize(300, 200);
 f.setLayout(null);
 f.setVisible(true);
 }
}