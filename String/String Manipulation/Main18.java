public class Main18 {
 public static void main(String args[]){
String str1 = "Oracle";
String str2 = "Java";
String fstr = String.format("My String is: %1$s, %1$s and %2$s", str1, str2);
System.out.println(fstr);
 }
}