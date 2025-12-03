public class Main12 
{
 public static void main(String[] args) 
{
 String myStr = "VSICS College";
 System.out.println(myStr.contentEquals("VSICS College"));
 System.out.println(myStr.contentEquals("VSICS "));
 System.out.println(myStr.contentEquals("College"));
 }
}