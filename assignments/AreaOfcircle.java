/*15.Write a program to find the area of a circle using a for loop where radius 
is coming from math.random and pi is coming from math.pi.
The loop has to execute 10 times*/
package assignments;
public class AreaOfcircle {
	public static void main(String[] args)
	{
		 double pi= Math.PI;
		 double area;
		 
		for (int i=10; i>0; i--)
		{
			double r = Math.random();
			area = pi*r*r;
			System.out.println(area);
			
		}
	}

}
