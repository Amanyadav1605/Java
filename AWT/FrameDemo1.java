import java.awt.*;
public class FrameDemo1
{
 public static void main (String[]args)
 {
 Frame f = new Frame ();
 Label lb = new Label ("Hello World");
 f.add (lb);
 f.setVisible (true);
 f.setSize (600, 600);
 }
}