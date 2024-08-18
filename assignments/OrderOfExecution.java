package assignments;
public class OrderOfExecution 
{
static 
{
	System.out.println("SIB");	                 //SIB
}
{
	System.out.println("IIB");             //IIB	
}

OrderOfExecution()
{
	System.out.println("Constructor");	                //Constructor
}

public static void main(String[] args)
{
	//new IIB();
	new OrderOfExecution();
	System.out.println("Main method");	
	new OrderOfExecution();
}
}