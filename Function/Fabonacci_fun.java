import java.util.*;
class  Fabonacci_fun
{
public static void fab(int c)
{
int i,a=-1,b=1,x;
for(i=1;i<=c;i++)
{
 x=a+b;
System.out.println(x);
a=b;
b=x;
}
}
public static void main(String args[])
{
int a ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
fab(a);
}
}

