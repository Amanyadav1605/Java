interface Continent
{
void showContinent();
}
interface Country extends Continent
{
 public void showCountry();
}
 interface State extends Country 
{
 public void showState();
}
public class City implements State
{
public void showContinent()
{
System.out.println("Asia");
}
 public void showCountry()
{
System.out.println("India");
}
 public void showState()
{
System.out.println("Uttar Pradesh");
}
 public void showCity()
{
System.out.println("Kanpur");
}
public static void main(String args[])
{
City c = new City();
c.showContinent();
c.showCountry();
c.showState();
c.showCity();
}
}

