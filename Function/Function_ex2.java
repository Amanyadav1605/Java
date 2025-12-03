//Function with no return with argument
import java.util.*;
class  Function_ex2
{
public static void add(int a ,int b)
{
int c=a+b;

System.out.println("Addtion of two number is: " +c);
System.out.println("-------------------------------------");
}
public static void main(String args[])
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
x=sc.nextInt();
y=sc.nextInt();
add(x,y);
}
}


