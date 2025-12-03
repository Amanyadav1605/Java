class Parent 
{
final int COUNT=100;
}
class Final_ex
{
public static void main(String args[])
{
Parent obj=new Parent();
int num=obj.COUNT+100;
System.out.println(obj.COUNT);
System.out.println(num);
}
}