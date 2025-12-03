class ReplaceDemo
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("I hate coding!");
System.out.println("Original StringBuffer: " + sb);
sb.replace(2, 6, "love");
System.out.println("After replace: " +sb);
}
}