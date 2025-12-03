class Student 
{
int m1,m2;
void getmarks(int a,int b)
{
m1=a;
m2=b;
}
void putmarks()
{
System.out.println("Subject 1 marks is "+m1);
System.out.println("Subject 2 marks is "+m2);
}
}
interface Sport
{
final int SP=98;
abstract void spmarks();
}
class Detail extends Student implements Sport 
{
public void spmarks()
{
System.out.println(" Sports marks is "+SP);
}
void report()
{
int total = m1+m2+SP;
putmarks();
spmarks();
System.out.println("Student total marks is "+total);
}
}
class Interface_ex1
{
public static void main(String args[])
{
Detail dt=new Detail();
dt.getmarks(78,89);
dt.report();
}
}


