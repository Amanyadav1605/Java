import java.util.*;
class Pallindrome
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
sum=sum*10+rem;
n=n/10;
}
if(temp==sum)
System.out.println("Num is Pallindrome "+temp);
else
System.out.println("Num is Pallindrome "+temp);
}
}
