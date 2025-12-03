interface A
{
void msg() ; //No body.
}
public class B1 implements A
{
// Override method declared in interface.
public void msg()
{
System.out.println("Hello Java ");
}
void show()
{
System.out.println("Welcome You ");
}
public static void main(String args[])
{
B1 b = new B1();
b.msg();
b.show();
//A a=new B1(); //A reference of interface is pointing to object of class B.
//a.msg();
//a.show();
}
}