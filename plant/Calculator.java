package plant; 
public class Calculator 
{
public int a,b;
public Calculator (int x, int y)
{
 a=x;
 b=y;
}
public void calc()
{
 System.out.println("Addition is " +(a+b));
 System.out.println("Subtraction is " +(a-b));
 System.out.println("Multipication is " +(a*b));
 System.out.println("Division is " +(a/b));
}
}