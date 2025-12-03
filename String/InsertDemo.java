class InsertDemo
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("I Java Programming!");
System.out.println("Original StringBuffer: " + sb);
sb.insert(2, "Like ");
System.out.println("New StringBuffer: " +sb);
}
}