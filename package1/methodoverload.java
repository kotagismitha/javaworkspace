package package1;

public class methodoverload {
	
	static void add ()
	{
		
	}
static void add (int a)
{
	System.out.println ("1");		
}
static void add (boolean a , int b)
{
	System.out.println ("2");	
}
static void add (char a, char b)
{
	System.out.println ("3");
}
static void add (double a, boolean b)
{
	System.out.println ("4");	
}

void add (int a, int b, int c)
{
	int sum= a+b+c;
	System.out.println (sum);
}
public static void main(String[] args) 
{
 add ('A', 'M');
methodoverload m1 = new methodoverload();
m1.add(55,44,87);
}
}




