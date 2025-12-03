import java.util.*;
class  Prime_fun
{
public static void prime(int n)
{
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
c++;
}
if(c==2)
System.out.println( n+ " Prime number");
else
System.out.println(n+ " Not Prime number");
}
public static void main(String args[])
{
int a ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
prime(a);
}
}


