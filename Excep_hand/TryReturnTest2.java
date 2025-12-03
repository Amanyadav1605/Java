class TryReturnTest2
{
int m1() // Complie time error.
{
try
{
System.out.println(" I am in try block");
return 50;
}
catch(Exception e)
{
System.out.println(" I am in catch block");
}
return 50;
System.out.println(" Statement after return"); //Unreachable code
}
public static void main(String[] args)
{
TryReturnTest1 ft= new TryReturnTest1();
System.out.println(ft.m1());
}
}