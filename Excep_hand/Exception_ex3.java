import java.util.Scanner;
class Exception_ex3
{
public static void main(String args[])
{
int a[]=new int[6];
Scanner sc=new Scanner(System.in);
System.out.println("Enter element");
try
{
a[21]=sc.nextInt();
System.out.println("Element at third index of an array a is is "+a[3]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(AirthmeticException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
}
}



 