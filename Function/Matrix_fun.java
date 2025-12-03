import java.util.*;
class  Matrix_fun
{
public static void matint(int a[][],int b[][])
{
int c[][]=new int[2][2];
System.out.println("\n------------Addition of matrix a&b are--------------\n ");
for( int i=0;i<2;i++)
{
for( int j=0;j<2;j++)
{
 c[i][j]=0;
for( int k=0;k<2;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
System.out.println(c[i][j]+"\t");
}
System.out.println();
}
}
}
public static void main(String args[])
{
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 4 Element in First Matrix ");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
 a[i][j]=sc.nextInt();
}
}
System.out.println("Enter 4 Element in Second Matrix ");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
 b[i][j]=sc.nextInt();
}
}
matint(a,b);
}


