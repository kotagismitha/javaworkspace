/*18.Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, 
Circumferance of reactangle, Circumferance of trinagle, Circumferance of trepezium)*/
package assignments;
import java.util.Scanner;
public class CircumferenceofTrapezium {
	public static void main(String[] args) { 
		{
			Scanner s2= new Scanner(System.in);
			System.out.println("Enter the value of 4 sides of the trapezium");
			double a = s2.nextDouble();
			double b = s2.nextDouble();
			double c = s2.nextDouble();
			double d = s2.nextDouble();
			System.out.println("Details are recorded and are as follows");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			double circumferenceoftrapezium = a+b+c+d;
			System.out.println("Circumference of the Trapezium is ");
			System.out.println(circumferenceoftrapezium);		}	}	}

