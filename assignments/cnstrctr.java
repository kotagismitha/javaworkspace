package assignments;

public class cnstrctr 
{
	cnstrctr()
	{
		System.out.println("This is constructor");	
	}
	cnstrctr(int a)
	{
		System.out.println("This is a parameterized constructor");	
	}
	cnstrctr(String name)
	{
		System.out.println("This is a parameterized constructor with string");	
	}
	public static void main(String[] args) 
	{
	//cnstrctr a1= new cnstrctr();
	//cnstrctr a2= new cnstrctr();
	cnstrctr a3= new cnstrctr();
	
	// second way of creating object
	new cnstrctr();
	new cnstrctr (54);
	new cnstrctr ("Bhanu");
	}
}
