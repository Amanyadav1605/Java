import java.util.Scanner;
class Student 
{
String name ;
int roll ;
double per;
void get(String n,int r,double p)
{
name=n;
roll=r;
per=p;
}
void disp()
{
System.out.println("Student name is "+name);
System.out.println("Student roll no is "+roll);
System.out.println("Student percentage is "+per);
}
}
class Main_ex5
{
public static void main(String args[])
{
Student stu=new Student();
stu.get("Nitin",912,87.8);
stu.disp();
}
}