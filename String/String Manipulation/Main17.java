public class Main17 {
 public static void main(String args[]){
String str = "Hello, Notion User";
String formattedString = String.format("My String is %s", str);
String formattedString2 = String.format("My String is %.6f",14.140);
System.out.println(formattedString);
System.out.println(formattedString2);
 }
}
