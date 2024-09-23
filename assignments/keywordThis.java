package assignments;
public class keywordThis 
{
	keywordThis()
	{
		this(48);
		System.out.println("Non-param const called");
	}
	keywordThis(int a)
	{
		this (9, 7);
		if (a%2==0)
		{
			System.out.println("the given number is even");
		}
		else
		{
			System.out.println("A is odd");
		}
	}
		keywordThis(int q, int r)
		{
			int sum = q+r;
		System.out.println("The sum of the given numbers is "  +sum);
		}
public static void main (String args[])
{
	new keywordThis();
	}
}


