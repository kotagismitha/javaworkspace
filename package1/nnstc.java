/*4.call non static method
 5.call multiple non static method*/
package package1;

public class nnstc {
	void add()
	{
	System.out.println ("addition");
	
	}
	void sub()
	{
	System.out.println ("subtraction");
	
	}
	public static void main(String[] args)
	{
		nnstc L1=new nnstc();
		L1.add();
		L1.sub();
		}
}
