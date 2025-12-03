import java.util.*;
class DoWhile
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Integer:");
i=sc.nextInt();
do 
{
System.out.println(i);
i++;
}
while(i<=100);
}
}