import java.util.*;
class Calculator
{
public static void main(String args[])
{
char ch;
int a,b;
double d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a First Integer:");
a=sc.nextInt();
System.out.println("Enter a Second Integer:");
b=sc.nextInt();
System.out.println("Enter a Character:");
ch=sc.next().charAt(0);
d=a/b;
System.out.println("-----Operator-------");
switch(ch)
{
case'+':
System.out.println("Addtion of A&B is:"+(a+b));
break;
case'-':
System.out.println("Subtraction of A&B is:"+(a-b));
break;
case'*':
System.out.println("Multiplication of A&B is:"+(a*b));
break;
case'/':
System.out.println("Division of A&B is:"+d);
break;
case'%':
System.out.println("Modulas of A&B is:"+(a%b));
break;
default:
System.out.println("Invalid opertor");
}
}
}


