class Student 
{
String name ;
int roll ;
double per;
Student(String n,int r,double p)
{
name=n;
roll=r;
per=p;
}
void put()
{
System.out.println("Student name is "+name);
System.out.println("Student roll no is "+roll);
System.out.println("Student percentage is "+per);
}
}
class Main_ex8
{
public static void main(String args[])
{
Student stu=new Student("Nitin",912,87.8);
stu.put();
}
}
//Paramertrize constructor