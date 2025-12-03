//Multilevel Inheritance
class Shape
{
double length , br;
void getdimen(double l,double b)
{
length=l;
br=b;
}
}
class Rectangle extends Shape
{
double recarea()
{
double res= length*br;
return res;
}
}
class CostCal extends Rectangle
{
double cost;
void costperunit(double c)
{
cost=c;
}
double calc()
{
double total=recarea()*cost;
return total;
}
}
class Multilevel
{
public static void main(String args[])
{
CostCal obj=new CostCal();
obj.getdimen(80.78,54.87);
obj.costperunit(240);
double area=obj.recarea();
double price=obj.calc();
System.out.println("Total area of rectangle is "+area);
System.out.println("After calculation price of field is "+price);
}
}
