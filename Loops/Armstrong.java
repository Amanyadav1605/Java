import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int n,sum=0,rem,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
n=sc.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
System.out.println("Num is Armstrong"+sum);//153
}
}
