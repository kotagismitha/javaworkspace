package assignments;
import java.util.Scanner;
public class SIB {
static
{
	System.out.println("This is SIB");
}
{
	System.out.println("I am a message from the IIB block");
}
SIB()
{
	int value1;
	int value2;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Provide the values to be added " );
	value1 = s1.nextInt();
	value2 = s1.nextInt();
	System.out.println("the sum of two numbers is " +(value1+value2));
}
public static void main (String[] args)
{	
	System.out.println("To understand the order of execution");
    new SIB();
  System.out.println("This is from the main method");
  new SIB();
}
}
