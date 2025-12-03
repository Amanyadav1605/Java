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
class Executioninterface Rectangle
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
Rectangle rc;
rc = new RecArea();
rc.calc(20,30);
rc =new RecPer();
rc.calc (20,30);
}
}
 
