import java.util.Scanner;
class StudentRec
{
public static void main (String args[])
{
String name;
int roll;
double per;
char grade;
Scanner sc=new Scanner (System.in);
System.out.println("Enter Student name ");
name= sc.next();
System.out.println("Enter Student roll number ");
roll= sc.nextInt();
System.out.println("Enter Student percentage ");
per= sc.nextDouble();
System.out.println("Enter Student grade ");
grade= sc.next().charAt(0);
System.out.println("-------------STUDENT DETAILS------------------");
System.out.println("Student name is "+name);
System.out.println("Student roll number is "+roll);
System.out.println("Student percentage is "+per);
System.out.println("Student grade is " +grade);
}
}