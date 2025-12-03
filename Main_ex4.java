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
class Main_ex4
{
public static void main(String args[])
{

Student stu=new Student();
Scanner sc=new Scanner (System.in);
System.out.println("Enter Student name ");
stu.name= sc.next();
System.out.println("Enter Student roll number ");
stu.roll= sc.nextInt();
System.out.println("Enter Student percentage ");
stu.per= sc.nextDouble();
stu.get(stu.name,stu.roll,stu.per);
stu.disp();
}
}