import java.util.Scanner;
class Ifage
{
public static void main(String args[])
{
int age;
Scanner sc=new
Scanner(System.in);
System.out.println("Enter your age:");
age=sc.nextInt();
if(age>=18)
{
System.out.println("Welcome to home");
}
else
{
System.out.println("You'r Minor");
}
}
}