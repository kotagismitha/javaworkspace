/*18.Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, 
Circumferance of reactangle, Circumferance of trinagle, Circumferance of trepezium)*/
package assignments;
import java.util.Scanner;
public class areaofrectangle {	
	public static void main(String[] args) 
	{
		Scanner s2= new Scanner(System.in);
		System.out.println("Provide the lenght of the rectangle");	
		double l = s2.nextDouble();
		System.out.println("Provide the lenght of the rectangle");
		double b = s2.nextDouble();
		System.out.println("The attributes of the rectangle are ");
		System.out.println(l);
		System.out.println(b);
		double areaoftherectangle = l*b;
		System.out.println("The area of the rectangle is ");
		System.out.println(areaoftherectangle);
	}
	}

