import java.util.Scanner;

class Exception_ex2
{
public static void main(String args[])
{
int a[]=new int[6];
Scanner sc=new Scanner(System.in);
System.out.println("Enter element");
try
{
a[7]=sc.nextInt();
System.out.println("Enter element ");
}
catch(ArrayIndexOutOfBoundsException obj)
{
System.out.println(obj);
}
}
}
 