import java.util.Scanner;
class TestClass1
{
private static int age;
static void validate() 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
age = sc.nextInt();
if(age < 18)
throw new AirthematicException ( "Invalid Age, You are not eligible to vote");
else
System.out.println("Welcome to Vote");
}
public static void main(String[] args)
{
validate();
}
}
 