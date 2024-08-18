package assignments;

public class Assertion   //Assert keyword
{
public static void main (String args[])
{
	int age = 10;
	assert age==12;           //Just displays assertion error
	assert age==10;           //displays SYSO message
	assert age==20:"Message1";  // along with assertion error this message is displayed
	{
		System.out.println("Happy Birthday!");

	String a= "Rucha";
	assert a.length()==5:"Name is short";
	System.out.println("Hello Rucha!");
}
}
}
