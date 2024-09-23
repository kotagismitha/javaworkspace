//WAP to showcase the throw and throws handling
package assignments;
import java.util.InputMismatchException;
import java.util.Scanner;
public class handleException 
{
	public static void main (String args[]) throws ArrayIndexOutOfBoundsException
{
	int subjmarks[]=new int[5];
	int total = 0;
	Scanner s1= new Scanner(System.in);
	
	System.out.println("Provide the marks obtained in each subject of the exam ");
	try
	{
	for (int i=0;i<=subjmarks.length;i++) 
	{
		subjmarks[i] = s1.nextInt();
		total= total+subjmarks[i];
	System.out.println("Provided input values are " +subjmarks);
	System.out.println("Total marks obtained is "  +total);
	}
	}
	catch (InputMismatchException a1)
	{
		System.out.println(a1);
	System.out.println("format of input not accepted");
	}

	finally
	{
		System.out.println("Thank you for using the application");	
	}
}
}

