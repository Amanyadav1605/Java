class FinallyBlock1Ex2
{
public static void main(String[] args)
{
int a=20, b = 0; //b>0
try
{
int div = a/b;
System.out.println("Div: " +div);
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("finally block must be executed");
}
System.out.println("Hello Java");
}
}
