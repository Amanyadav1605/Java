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
class Main_ex6
{
public static void main(String args[])
{
String n1;
int r1;
double p1;
Student stu=new Student();
Scanner sc=new Scanner (System.in);
System.out.println("Enter Student name ");
n1= sc.next();
System.out.println("Enter Student roll number ");
r1= sc.nextInt();
System.out.println("Enter Student percentage ");
p1= sc.nextDouble();
stu.get(n1,r1,p1);
stu.disp();
}
}