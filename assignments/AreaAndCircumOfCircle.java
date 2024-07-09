/*14.Write a program to calculate the area and circumference of a circle in different 
methods and then call them in the main method */
package assignments;
public class AreaAndCircumOfCircle {
	static void AreaOfCircle(double rad)
	{
		double circlearea = Math.PI*rad*rad;
		System.out.println(circlearea);
	}
	static void circumferenceOfCircle(double rad)
	{
		double circumOfCircle = 2*Math.PI*rad;
		System.out.println(circumOfCircle);
	}
		public static void main(String[] args) 
		{
			AreaOfCircle(9.89);
			circumferenceOfCircle(9.89);			
		}

	}

