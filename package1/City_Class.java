package package1;
class state_class
{
	state_class()
	{
	System.out.println("State class constructor");
	}
}
public class City_Class extends state_class
{
   City_Class()
{
	System.out.println("City class constructor");	
}
public static void main(String[] args) {
	new City_Class();
}
}
