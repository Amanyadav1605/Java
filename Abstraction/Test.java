abstract class Hello
{
void msg1()
{
System.out.println("msg1 Hello");
}
abstract public void msg2();
}
class Test extends Hello
{
public void msg2()
{
System.out.println("msg2 Test");
}
public static void main(String args[])
{
Test obj = new Test();
obj.msg1();
obj.msg2();
}
}