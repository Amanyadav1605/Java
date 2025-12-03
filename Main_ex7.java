import java.util.Scanner;
class Student 
{
String name ;
int roll ;
double per;
Student()
{
System.out.println("Default construtor invoked");
}
void putdata()
{
System.out.println("Student name is "+name);
System.out.println("Student roll no is "+roll);
System.out.println("Student percentage is "+per);
}
}
class Main_ex7
{
public static void main(String args[])
{
Student std=new Student();
std.putdata();
}
}