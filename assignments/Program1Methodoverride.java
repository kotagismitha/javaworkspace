package assignments;
class preapproved
{
	void permission()
	{
	System.out.println("you are eligible for a debit card");
	}	
}
public class Program1Methodoverride extends preapproved 
{
	void permission()
	{
		System.out.println("you have to open an account in the bank to get debit card");
	}
	public static void main(String[] args) 
	{
		Program1Methodoverride p1= new Program1Methodoverride();
		p1.permission();
	}
}


