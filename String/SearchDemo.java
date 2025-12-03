class SearchDemo
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("I am Java Programmer");
System.out.println("Original StringBuffer: " + sb);
int i;
i = sb.indexOf("Java");
System.out.println("First index : " +i);
i = sb.lastIndexOf("Am");
System.out.println("Last index: " +i);
}
}


