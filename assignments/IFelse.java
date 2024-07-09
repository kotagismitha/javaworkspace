/*6.conditional if else block
12.Write a program to find the vote eligibility for a person whose age is 17. 
Then run the same program again for age=25 */
package assignments;
public class IFelse {
	public static void main(String[] args)
	{
		int age = 17;
		if (age>=18)
		{
			System.out.println ("Person is eligible to vote");
		}
		else
		{
			System.out.println ("Person is not eligible to vote");
		}
		
		age=25;
		if (age>=18)
		{
			System.out.println ("Person is eligible to vote");
		}
		else
		{
			System.out.println ("Person is not eligible to vote");
		}
		
		
	}

}
