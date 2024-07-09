/*18.Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, 
Circumferance of reactangle, Circumferance of trinagle, Circumferance of trepezium)*/
package assignments;
import java.util.Scanner;
public class AreaofTrapzeium {
	public static void main(String[] args) {
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter the details base and height");
		double a = s2.nextDouble();
		double b = s2.nextDouble();
		double h = s2.nextDouble();
		System.out.println("Details are recorded and are as follows");
		System.out.println(a);
		System.out.println(b);
		System.out.println(h);
		double areaoftrapezium = (a+b)/2*h;
		System.out.println("Area of the Trapezium is ");
		System.out.println(areaoftrapezium);
		}	
	}

