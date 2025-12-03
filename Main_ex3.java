import java.util.Scanner;
class Student 
{
String name ="Nitin Yadav";
int roll =921;
double per=91.5;
void disp()
{
System.out.println("Student name is "+name);
System.out.println("Student roll no is "+roll);
System.out.println("Student percentage is "+per);
}
}
class Main_ex3
{
public static void main(String args[])
{
Student stu=new Student();
stu.disp();
}
}