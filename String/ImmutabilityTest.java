class ImmutabilityTest
{
public static void main(String[] args)
{
String s = "Hello";
String s1 = s.concat("world");
String s2 =new String("Hope you are all learning well");
System.out.println(s);
System.out.println(s1);
System.out.println(s2);
}
}