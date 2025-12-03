import java.util.Scanner;
class Exception_ex
{
public static void main(String args[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
a = sc.nextInt();
b = sc.nextInt();
try
{
c=a/(a-b);
System.out.println("Value of c is "+c);
}
catch(ArithmeticException e)
{
System.out.println("Exception handled successfully , normal flow start");
}
d=a/(a+b);
System.out.println("Value of d is "+d);
}
}
 