package assignments;

public class Finalvariable {
	final static double pi= 3.14;//if declared as final, re-assigning value gives error
	static double r= 4.04;
	static void area()//pi*r*r
	{
		double a=pi*r*r;
		System.out.println(a);	                      
	}
	static void circumference()//2*pi*r
	{
		double c=2*r*pi;
		System.out.println(c);	                           
	}

	public static void main(String[] args)
	{
		area();
		circumference();
		
	}
}
