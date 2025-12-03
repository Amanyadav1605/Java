import java.util.*;
class Cout_ex1
{
public static void main(String args[])
{
int arr[]=new int[10];
int i,even=0,odd=0,esum=0,osum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 Element ");
for(i=0;i<10;i++)
{
 arr[i]=sc.nextInt();
}
System.out.println("-----------Element are---------------");
for(i=0;i< 10;i++)
{
System.out.println(arr[i] +"\t");
if(arr[i]%2==0)
{
even++;
esum=esum+arr[i];
}
else
{
odd++;
osum=osum+arr[i];
}
}
System.out.println("\n-----------------------------------------");
System.out.println(even+"even number are the found and sum of the even number is"+esum);
System.out.println(odd+"odd number are the found and sum of the odd number is"+osum);
}
}
