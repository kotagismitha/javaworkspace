/*13.Write a program with parameterized static method using char and 
Boolean as parameters */ 
package assignments;

public class Paramstatcharbool 
{
	static void character(char m)
	{
		System.out.println("This is a method with char type parameter");
		System.out.println(m);
	}
	static void boolret(boolean n)
	{
		System.out.println("This is a method with boolean type parameter");
		System.out.println(n);
	}

	public static void main(String[] args)
	{
      character('o');
      boolret(true);
      
}
}
