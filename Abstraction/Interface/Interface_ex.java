interface A
{
final int NUMA=100;
abstract void dispa();
}
interface B
{
final int NUMB=100;
abstract void dispb();
}
class C implements A,B
{
public void dispa()
{
System.out.println("Interface A method invoked");
System.out.println("Final variable NUMA value is " + NUMA);
}
public void dispb()
{
System.out.println("Interface B method invoked");
System.out.println("Final variable NUMB value is " + NUMB);
}
}
class Interface_ex
{
public static void main(String args[])
{
C obj=new C();
obj.dispa();
obj.dispb();
}
}