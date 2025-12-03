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
String name;
int id;
Student(String n1,String n2,int i1,int i2)
{
super.name=n1;
name=n2;
super.id=i1;
id=i2;
}
void display()
{
System.out.println("Student name is "+name);
System.out.println("Student id is "+id);
}
}
class Super
{
public static void main(String args[])
{
Student stu=new Student ("Atul","Nitin",504,245);
stu.disp();
stu.display();
}
}
