class CapacityTest
{
public static void main(String[] args)
{
StringBuffer sb =new StringBuffer();
System.out.println("Before adding any character: ");
System.out.println("Length = "+sb.length());
System.out.println("Default initial capacity = " +sb.capacity());
sb.append("qwertyuiopasdfgj");
System.out.println("After adding 16th characters:");
System.out.println("Length = "+sb.length());
System.out.println("Capacity = "+sb.capacity());
sb.append("a");
System.out.println("After adding 17th characters:");
System.out.println("Length = "+sb.length());
System.out.println("Capacity = "+sb.capacity());
sb.append("abcdefghijklmnopq");
sb.append("x");
System.out.println("After adding 35th characters:");
System.out.println("Length = "+sb.length());
System.out.println("Capacity = "+sb.capacity());
}
}

