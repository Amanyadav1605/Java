class TryReturnTest3
{
int m1() 
{
try
{
System.out.println(" I am in try block");
int x = 10/0;
return 50;
}
catch(ArithmeticException ae)
{
System.out.println(" I am in catch block");
}
return 20;
}
public static void main(String[] args)
{
TryReturnTest3 ft= new TryReturnTest3();
System.out.println(ft.m1());
}
}