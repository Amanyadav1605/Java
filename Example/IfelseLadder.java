import java.util.*;
class IfelseLadder
{
public static void main(String args[])
{ 
int m1,m2,m3,m4,per;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 4 Subject marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
per=(m1+m2+m3+m4)/4;
if(per>=75)
{
System.out.println("Passed with HONOURS");
}
else if(per>=60)
{
System.out.println("Passed with FIRST DIVISION");
}
else if(per>=50)
{
System.out.println("Passed with SECOND DIVISION");
}
else if(per>=40)
{
System.out.println("Passed with THIRD DIVISION");
}
else 
{
System.out.println("FAILED");
}
}
}
