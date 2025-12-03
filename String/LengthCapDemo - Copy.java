class LengthCapDemo
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Java Technology");
System.out.println("Original string: " + sb);
int lengthSB = sb.length();
int capacitySB = sb.capacity();
System.out.println("Length of StringBuffer: " +lengthSB);
System.out.println("Capacity of StringBuffer: " +capacitySB);
sb.ensureCapacity(40);
System.out.println("Now, capacity: " +sb.capacity());
sb.setLength(15);
System.out.println("Now, length: " +sb.length());
}
}
