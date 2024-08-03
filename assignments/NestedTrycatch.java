/*48.Write a program try and catch similar Nested ifelse using Scanner */
package assignments;

public class NestedTrycatch {
	public static void main(String[] args)
	{
		int values[]= new int[5];
	try 
	{
		System.out.println(values.length);
		System.out.println(values[0]);
		System.out.println(values[6]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Check the upper limit of the array");
	}
	catch(NullPointerException a)
	{
		System.out.println("The provided index holds a null value");	
	}
}
}

