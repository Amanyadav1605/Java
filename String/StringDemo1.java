class StringDemo1
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("I love Java Programming");
System.out.println("Original StringBuffer: " + sb);
System.out.println("Character at index 7: " +sb.charAt(7));
System.out.println("Unicode code point at index 7: " +sb.codePointAt(7));
System.out.println("Unicode code point before index 7: " +sb.codePointBefore(7));
System.out.println("Code points between indices 2 and 7: " +sb.codePointCount(2,7));
}
}