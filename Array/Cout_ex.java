import java.util.*;
class Cout_ex
{
public static void main(String args[])
{
int arr[]=new int[10];
int i,even=0,odd=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 Element ");
for(i=0;i<10;i++)
{
 arr[i]=sc.nextInt();
}
System.out.println("--------Element are----------");
for(i=0;i< 10;i++)
{
System.out.println(arr[i] +"\t");
if(arr[i]%2==0)
even++;
else
odd++;
}
System.out.println("--------------------------------------------");
System.out.println(even+"even number are the found");
System.out.println(odd+"odd number are the found");
}
}
