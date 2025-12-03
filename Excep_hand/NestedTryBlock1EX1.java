class NestedTryBlock1EX1
{
public static void main(String[] args)
{
String str = "Puneet";
int x[ ] = {0, 1, 2, 3, 4};
try
{
str = null; // remove this line to remove exception
int slength = str.length();
System.out.println("String length: " +slength);
try 
{
int y = 6; // index value must be<6 
System.out.println(x[y]);
}
catch(ArrayIndexOutOfBoundsException aie)
{
System.out.println("Exception is thrown ");
System.out.println(aie.toString());
}
}
catch(NullPointerException npe)
{
System.out.println("Exception is thrown ");
System.out.println(npe.toString());
}
}
}
