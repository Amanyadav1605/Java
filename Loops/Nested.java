class Nested 
{
public static void main(String arg[])
{
int a=10,b=5,c=15,big;
if (a>b)
{
if (a>c)
{
big=a;
}
else
{
big=c;
}
}
else
{
if(b>c)
{
big=b;
}
else
{
big=c;
}
}
System.out.println("Greatest element is "+big);
}
}


