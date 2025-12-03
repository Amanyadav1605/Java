 class StringBufferDemo
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Live with");
System.out.println("Buffer before: " + sb);
System.out.println("charAt(1) before: " + sb.charAt(1));
sb.setCharAt(1, 'o');
sb.setLength(4);
System.out.println("Buffer after setting length: " + sb);
System.out.println("charAt(1) after = " + sb.charAt(1));

}
}

