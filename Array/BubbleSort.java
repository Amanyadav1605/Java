import java.util.*;
class BubbleSort
{
public static void main(String args[])
{
int arr[]=new int[5];
int i,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 Element ");
for(i=0;i<5;i++)
{
 arr[i]=sc.nextInt();
}
System.out.println("-------------Element Before sort are----------------");
for(i=0;i<5;i++)
{
System.out.println(arr[i] +"\t");
}
for(i=0;i<5;i++)
{
for(int j=0;j<4;j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("\n---------------Element after sort are -----------------");
for(i=0;i<5;i++)
{
System.out.println(arr[i]+"\t");
}
}
}

