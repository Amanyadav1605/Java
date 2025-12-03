import java.util.*;
class Factorial
{
public static void main(String args[])
{
int num,fact=1,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
num=sc.nextInt();
temp=num;
while(num>0)
{
fact=fact*num;
num--;
}
System.out.println("Factorial of "+temp +" is " +fact);
}
}
