import java.util.Scanner;
class Student
{
String name;
int roll;
double per;
}
class Main_ex1
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
System.out.println("Student name is "+stu.name);
System.out.println("Student roll no is "+stu.roll);
System.out.println("Student percentage is "+stu.per);
}
}