import java.util.*;
class InsertSort
{
public static void main(String args[])
{
int arr[]=new int[5];
int i,temp,k;
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
for(int j=i+1;j<5;j++)
{
if(arr[i]>arr[j])
{
temp=arr[j];
for(k=j;k>i;k--)
{
arr[k]=arr[k-1];
}
arr[k]=temp;
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
