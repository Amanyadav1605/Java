final class Parent  //Error final
{
final int COUNT=100;
final void disp()  //Error final
{
System.out.println("Value of COUNT is "+COUNT);
}
}
class Child extends Parent
{
void disp()
{
 COUNT=COUNT+100; //Error
System.out.println("Value of COUNT after modification is "+COUNT);
}
}
class Final_ex1
{
public static void main (String args[])
{
Child obj=new Child();
obj.disp();
}
}