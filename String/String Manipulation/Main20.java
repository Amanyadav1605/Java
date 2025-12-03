public class Main20 
 {
 public static void main(String[] args) 
{
 String str = "Hello World!";
 byte[] bytes = str.getBytes();
 for (byte b : bytes)
 {
 System.out.print(b + " ");
 }
 }
}