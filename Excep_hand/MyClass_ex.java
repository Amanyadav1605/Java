class OwnException extends Exception
{
// Declare default constructor.
OwnException()
{
System.out.println("Caught a user defined exception");
}
}
public class MyClass_ex
{
public static void main(String[] args)
{
try
{
// Create an object of user defined exception and throw it using throw clause.
OwnException obj = new OwnException();
throw obj;
}
catch(OwnException ex)
{
System.out.println(ex);
}
}
}
