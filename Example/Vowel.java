import java.util.*;
class Vowel
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:");
ch=sc.next().charAt(0);
System.out.println("-----Result-------");
switch(ch)
{
case'a':
System.out.println("VOWEL");
break;
case'e':
System.out.println("VOWEL");
break;
case'i':
System.out.println("VOWEL");
break;
case'o':
System.out.println("VOWEL");
break;
case'u':
System.out.println("VOWEL");
break;
default:
System.out.println("CONSONENT");
}
}
}


