import java.util.*;
class Matrix
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int i,j,upper=0,lower=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 9 Element ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
 a[i][j]=sc.nextInt();
}
}
System.out.println("\n----------  Matrix are ---------------\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
 System.out.print(a[i][j]+"\t");
if(i<j)
upper=upper+a[i][j];
if(i>j)
lower=lower+a[i][j];
}
System.out.println();
}
System.out.println("\n---------------------------------------\n");
System.out.println("Upper triangular  matrix sum is "+upper);
System.out.println("Lower triangular matrix sum is "+lower); 
}
}

