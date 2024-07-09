/* 13.Write a program with parameterized static method using char and Boolean as 
parameters*/
package assignments;
public class StaticParams {
	static void methodchar(char a)
	{
	System.out.println("A static method with parameters is called here");
	System.out.println(a);
	 
	}
	static void methodoboolean(boolean r)
	{
		System.out.println(r);
	}
	public static void main(String args[])
	{
		methodchar('M');
		methodoboolean(true);
	}
}
