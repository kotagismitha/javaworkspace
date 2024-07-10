package package1;
class Random_class
{
	void login()//supressed or it has been overridden
	{
		System.out.println(" emial id ");
	}	
}
public class MethodOverride extends Random_class
{
	void login()
	{
		System.out.println(" mobile no");
		super.login();

	}
public static void main(String[] args) 
{
	MethodOverride m1=new MethodOverride();
	m1.login();
	
}	
}
