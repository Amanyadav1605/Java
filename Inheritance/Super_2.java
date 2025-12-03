class Oprands
{
int a,b;
Oprands()
{
 System.out.println("Parent class are invoked ");
}
void disp()
{
System.out.println("Value of a is "+a);
System.out.println("Value of a is "+b);
}
}
class Square extends Oprands
{
Square(int x,int y)
{
super();
a=x;
b=y;
}
void squa()
{
System.out.println("Square of a is "+(a*a));
System.out.println("Square of b is "+(b*b));
}
}
class Cube extends Oprands
{
Cube(int x,int y)
{
super();
a=x;
b=y;
}
void cubefun()
{
System.out.println("Cube of a is "+(a*a*a));
System.out.println("Cube of b is "+(b*b*b));
}
}
class Super_2
{
public static void main(String args[])
{
Square sq=new Square(4,6);
sq.disp();
sq.squa();
System.out.println("\n--------------------------------------------------\n");
Cube cb=new Cube(3,5);
cb.disp();
cb.cubefun();
}
}
