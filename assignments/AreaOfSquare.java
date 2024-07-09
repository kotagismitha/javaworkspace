/*18.Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, 
Circumferance of reactangle, Circumferance of trinagle, Circumferance of trepezium)*/
package assignments;
import java.util.Scanner;
public class AreaOfSquare {
public static void main(String[] args) {
			Scanner s2= new Scanner(System.in);
			System.out.println("provide the length of the square");	
			double a = s2.nextDouble();
			System.out.println("The lenght of the side of the square is ");
			System.out.println(a);
			double areaOfSquare = a*a;
			System.out.println("The area of the square is ");
			System.out.println(areaOfSquare);}
}
