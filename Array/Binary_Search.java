import java.util.*;
class Binary_Search
{
public static void main(String args[])
{
int arr[]=new int[10];
int i,ele,flag=0,low=0,upper=9,mid;
Scanner sc=new Scanner(System.in);
System.out.println("Enter  Element ");
for(i=0;i<10;i++)
{
 arr[i]=sc.nextInt();
}
System.out.println("Enter element to be Search");
ele=sc.nextInt();
System.out.println("------------------------------------------");
while(low<=upper)
{
mid=(low+upper)/2;
if(ele==arr[mid])
{
flag=1;
break;
}
else if(ele>arr[mid])
{
low=mid+1;
}
else
{
upper=mid-1;
}
}
if(flag==1)
System.out.println(ele+ "number is found Successfully");
else
System.out.println(ele+ "number not found");
}
}

