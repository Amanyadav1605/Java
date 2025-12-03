abstract class MyTest
{
abstract void calculate( int a,int b);
}
class Addition extends MyTest
{
public void calculate(int a, int b)
{
int x =a+b;
System.out.println("Addition  : "+x);
}
}
class Subtraction extends MyTest
{
public void calculate( int a, int b)
{
int y = a-b;
System.out.println("Subtract: "+y);
}
}
class Multiplication extends MyTest
{
public void calculate( int a, int b)
{
int z = a*b;
System.out.println("Multiplication: "+z);
}
}
class MyClass
{
public static  void main(String args[])
{
Addition a = new Addition();
Subtraction s = new Subtraction();
Multiplication m = new Multiplication();
a.calculate (20,30);
s.calculate(50,5);
m.calculate(10,20);
}
}