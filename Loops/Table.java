import java.util.*;
class Table
{
public static void main(String args[])
{
int i,n,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
n=sc.nextInt();
for(i=1;i<=10;++i)
{
b=n*i;
System.out.println(n+"*"+i+"="+b);
}
}
}
