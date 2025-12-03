//Function with return with argument
import java.util.*;
class  Function_ex3
{
public static int add(int a ,int b)
{
int c;
c=a+b;
return c;
}
public static void main(String args[])
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
x=sc.nextInt();
y=sc.nextInt();
int res=add(x,y);
System.out.println("Addition is "+res);
}
}

