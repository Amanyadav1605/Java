import java.awt.*;
public class ListExample {
 public static void main(String[] args) {
 Frame f = new Frame("List Example");
 List list = new List(3, true);
 list.setBounds(100, 100, 100, 75);
 list.add("Java");
 list.add("C++");
 list.add("Python");
 f.add(list);
 f.setSize(300, 200);
 f.setLayout(null);
 f.setVisible(true);
 }
}