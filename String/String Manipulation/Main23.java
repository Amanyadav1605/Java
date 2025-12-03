public class Main23 {
 public static void main(String args[]) {
 String str1 = new String("Hello Java");
 str1 = str1.intern();
 String str2 = "Hello";
 str2 = str2.intern();
 System.out.println(str1.equals(str2));
 }
}