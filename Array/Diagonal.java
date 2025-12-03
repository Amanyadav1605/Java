import java.util.*;
class Diagonal
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 9 Element ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
 a[i][j]=sc.nextInt();
}
}
System.out.println("\n----------Matrix element are------------\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
 System.out.print(a[i][j]+"\t");
}
System.out.println();
}

System.out.println("\n----------Diagonal Matrix element are------------\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
{
 System.out.print(a[i][j]+"\t");
}
else
{
System.out.print("\t");
}
}
System.out.println();
}
}
}
