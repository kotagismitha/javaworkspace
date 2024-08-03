/*47. Write a program -send the value 2 from Scanner class try to get 
exception called as inputmismatchException and try to handle it.
(As per class 29)*/
package assignments;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch {	
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Provide the inputs");
		boolean name[]= new boolean[2];
		boolean a, b;

		try 
		{		
			a=s1.nextBoolean();
			b=s1.nextBoolean();	
		}
catch(InputMismatchException a1)
		{
	System.out.println(a1);
System.out.println ("Please provide boolean values as input");
}
		System.out.println(name[0]);
		System.out.println(name[1]);
		}
	}





