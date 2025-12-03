import java.awt.*;
public class TextAreaExample {
 public static void main(String[] args) {
 Frame f = new Frame("TextArea Example");
 TextArea ta = new TextArea("Welcome to AWT TextArea", 5, 20);
 ta.setBounds(50, 50, 250, 100);
 f.add(ta);
 f.setSize(400, 250);
 f.setLayout(null);
 f.setVisible(true);
 }
}
