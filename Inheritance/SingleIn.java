//Single Inheritance
class Teacher
{
String name;
int id;
void disp()
{
System.out.println("Teacher name is "+name);
System.out.println("Teacher id is "+id);
}
}
class Student extends Teacher
{
String sname;
int sid;
Student(String n1,String n2,int i1,int i2)
{
name=n1;
sname=n2;
id=i1;
sid=i2;
}
void display()
{
System.out.println("Student name is "+sname);
System.out.println("Student id is "+sid);
}
}
class SingleIn
{
public static void main(String args[])
{
Student stu=new Student ("Atul","Nitin",504,245);
stu.disp();
stu.display();
}
}
