import java.util.*;
class Array_ex
{
public static void main(String args[])
{
int arr[]=new int[10];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 Element ");
for(i=0;i<10;i++)
{
 arr[i]=sc.nextInt();
}
System.out.println("--------Element are----------");
for(i=0;i<=10;i++)
{
System.out.println(arr[i] +"\t");
}
}
}


