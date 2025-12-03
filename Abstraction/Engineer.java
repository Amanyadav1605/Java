abstract class Employee
{
private String name;
private int id;
Employee(String name, int id)
{
this.name= name;
this.id= id;
}
void m1()
{
System.out.println("Name: "+name);
System.out.println("Id: "+id);
}
}
class Engineer extends Employee
{
public Engineer (String name, int id)
{
super(name, id);
}
public static void main(String args[])
{
Engineer e = new Engineer("Deep",10202);
e.m1();
}
}
