package plant.pack;
public class Rectangle
{
public int len,br;
public Rectangle(int x,int y)
{
len=x;
br=y;
}
public void area()
{
System.out.println("Area of rectangle is "+(len*br));
}
public void perimeter()
{
System.out.println("Perimeter of rectangle is "+2*(len+br));
}
}