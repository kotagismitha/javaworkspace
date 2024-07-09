/*18.Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, 
Circumferance of reactangle, Circumferance of trinagle, Circumferance of trepezium)*/
package assignments;
import java.util.Scanner;
public class CircumferenceOfcircle 
{public static void main(String[] args) {
			Scanner s2= new Scanner(System.in);
			System.out.println("provide the radius of the circle");	
			double r = s2.nextDouble();
			System.out.println("The radius of the circle is ");
			System.out.println(r);
			double circumferenceofcircle = 2*Math.PI*r;
			System.out.println("The circumference of the circle is ");
			System.out.println(circumferenceofcircle);		}
		}

	

