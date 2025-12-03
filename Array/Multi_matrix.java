import java.util.*;
class  Multi_matrix
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 9 Element in First Matrix ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
 a[i][j]=sc.nextInt();
}
}
System.out.println("Enter 9 Element in Second Matrix ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
 b[i][j]=sc.nextInt();
}
}
System.out.println("\n----------------Multipication Matrix are ---------------\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=0;
for( int k=0;k<3;k++)
{
c[i][j] += a[i][k]*b[k][j];
}
System.out.print(c[i][j]+"\t");
}

System.out.println();
}
}
}