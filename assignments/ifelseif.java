/*7.conditional if else if block
 8.conditional operators */
package assignments;
public class ifelseif {
	public static void main(String[] args)
	{
		int a=20;
		int b= 30;
		int c=40;
		if(a!=b)
		{
			System.out.println ("if is executed");
		}
		else if (a==19)
		{
			System.out.println ("first else if is executed");
		}
		else if (a==20)
		{
			System.out.println (" second elseif is executed");	
		}
		else
		{
			System.out.println ("only else is executed");
		}
	}
}
