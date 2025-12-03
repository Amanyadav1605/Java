import java.util.Scanner;
class  Factorial_fun
{
public static int fact(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
public static void main(String args[])
{
int a ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
int res=fact(a);
System.out.println("Factorial is "+res);
}
}


