interface Rectangle
{
void calc(int l, int b);
}
class RecArea implements Rectangle 
{
public void calc(int l, int b)
{
int area = l*b;
System.out.println("Area of rectangle = "+area);
}
}
class RecPer implements Rectangle
{
public void calc(int l,int b)
{
int perimeter = 2*(l+b);
System.out.println("Perimeter of rectangle = "+perimeter);
}
}
class Execution
{
public static void main(String[] args)
{
Rectangle rc;      //Creating an interface reference
rc = new RecArea(); //Creating object of RecArea
rc.calc(20,30);     //calling method
rc =new RecPer();  //Creating an object of RecPer.
rc.calc (20,30);
}
}
 
