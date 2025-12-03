import java.util.*;
import plant.Calculator;
class Package_ex
{
public static void main(String args[])
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Two Integer:");
x=sc.nextInt();
y=sc.nextInt();
Calculator cl=new Calculator (x,y);
cl.calc();
}
}