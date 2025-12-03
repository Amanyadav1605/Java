import java.util.Scanner;
class Evenodd 
{
public static void main(String arg[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even" +n);
}
else
{
System.out.println("Odd" +n);
}
}
}