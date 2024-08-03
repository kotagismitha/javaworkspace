/*54.Utilizing Stack methods as:push(),pop(),peek()*/
package assignments;
import java.util.Stack;
public class Peek 
{
	public static void main (String args[])
	{
		Stack<String> s1= new Stack<String>();
		s1.push(null);
		s1.add("My");
		s1.add("day");
		s1.add("day");
		s1.add("was");
		s1.add(" ");
		s1.add("the");
		s1.push("Best");
		//s1.pop();
		System.out.println(s1);	
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1);
	}
}

