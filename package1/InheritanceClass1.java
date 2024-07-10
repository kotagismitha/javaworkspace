package package1;
class Father
{
	static void house()
	{
		System.out.println("Father has house");
	}
	static void car()
	{
		System.out.println("Father has car");	
	}
}
public class InheritanceClass1 extends Father
{
	static void laptop()
	{
		System.out.println("Child has laptop");
		}
	static void bike ()
	{
		System.out.println("Child has bike");
	}
	public static void main(String[] args) 
	{
		laptop();
		bike();
		car();
		
		
	}

}
