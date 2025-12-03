import java.util.Scanner;
class Add_op
{
public static void main (String args[])
{
int a,b,c;
Scanner sc=new Scanner (System.in);
System.out.println("Enter First Variable ");
a= sc.nextInt();
System.out.println("Enter Second Variable");
b= sc.nextInt();
c=a+b;
System.out.println("-------------ANSWER------------------");
System.out.println("A+B is equall to "+c);

}
}