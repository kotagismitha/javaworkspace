////28.Write a program for what happens within package (as per class 17)
package assignments;

public class Class2_withinPackage 
{
	public static void main(String[] args) {
		{
			 Class1_withinPackage c1 =new  Class1_withinPackage();
			 c1.call();
			 c1.call2();
			 //c1.call3();
			c1.call1();
			
		}
	}
}
