import java.util.*;
class Fabonacci
{
public static void main(String args[])
{
int i,a=-1,b=1,c ;
for(i=1;i<=15;i++)
{
 c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
