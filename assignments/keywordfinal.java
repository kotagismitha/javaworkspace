package assignments;
import java.util.Scanner;
public class keywordfinal 
{
	 final static float pi=3.14f;
	final static int days_IN_Year = 365;
public static void main (String args[])
{
	Scanner s1= new Scanner(System.in);
	System.out.println("Answer the security question, how many days are there in a non-leap year?");
	int input_days = s1.nextInt();
	if (input_days==days_IN_Year)
	{
		System.out.println("Authentication successful");
		System.out.println("Provide the radius of the circle");
		float r = s1.nextFloat();
		float area = pi*r*r;
		System.out.println("Area of the circle is  "  +area);
			}
	else
	{
		System.out.println("Authentication failed");
	}
	
}
}
