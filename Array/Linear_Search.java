import java.util.*;
class Linear_Search
{
public static void main(String args[])
{
int arr[]=new int[10];
int i,flag=0,ele;
Scanner sc=new Scanner(System.in);
System.out.println("Enter  Element ");
for(i=0;i<10;i++)
{
 arr[i]=sc.nextInt();
}
System.out.println("Enter element to be Search");
ele=sc.nextInt();
System.out.println("------------------------------------------");
for(i=0;i<10;i++)
{
System.out.println(arr[i] +"\t");
if(ele==arr[i])
{
flag=1;
break;
}
}
if(flag==1)
System.out.println(ele+ "number is found");
else
System.out.println(ele+ "number not found");
}
}
