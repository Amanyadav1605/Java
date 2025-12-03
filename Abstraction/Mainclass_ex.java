abstract class Identity
{
abstract void getName(String name);
abstract void getGender(String gender);
abstract void getCity(String city);
}
class Person extends Identity
{
void getName(String name)
{
System.out.println("Name : " +name);
}
void getGender(String gender)
{
System.out.println("Gender : " +gender);
}
void getCity(String city)
{
System.out.println("City : " +city);
}
 //Newly added method in subclass.
void getCountry(String country)
{
System.out.println("Country : " +country);
}
}
class Mainclass_ex
{
public static void main(String args[])
{
Identity i = new Person();
i.getName("NITIN");
i.getGender("MALE");
i.getCity("KANPUR");
//i.getCountry("INDIA"); //Compile- time error because we cannot access newly added method
}
}

























 