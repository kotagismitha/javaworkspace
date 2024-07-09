/*16.Write a program to make a form where the user is able to input his information. 
The following information is required:(First name, Email, Password, Gender, 
Present address, Permanent address, Pin code) */
package assignments;
import java.util.Scanner;
public class ScannerClassReadInputs
{ 
public static void main(String[] args) 
	{
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter the details");
		String Fname = s2.next();
		String Lname = s2.next();
		String Email = s2.next();
		String Password = s2.next();
		String pAddress =s2.next();
		String Pincode = s2.next();
		String tAddress = s2.next();
		System.out.println("Details are recorded");
		System.out.println("The recorded details are");
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(pAddress);
		System.out.println(Pincode);
		System.out.println(tAddress);		
}	
}

