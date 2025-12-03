import java.util.*;
class Prime_no
{
public static void main(String args[])
{
int n,cout=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
cout++;
}
if(cout==2)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is a  not prime number");
}
}
