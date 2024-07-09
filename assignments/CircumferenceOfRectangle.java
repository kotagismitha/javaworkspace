/*18.Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, 
Circumferance of reactangle, Circumferance of trinagle, Circumferance of trepezium)*/
package assignments;
import java.util.Scanner;
public class CircumferenceOfRectangle 
{public static void main(String[] args) 
{
	Scanner s2= new Scanner(System.in);
			System.out.println("provide the lenght and width of the rectangle");	
			double l = s2.nextDouble();
			double w = s2.nextDouble();
			System.out.println("The lenght of the side of the square is ");
			System.out.println(l);
			System.out.println(w);
			double circumferenceoftherectangle = (l+w)*2;
			System.out.println("The circumference of the rectangle is ");
			System.out.println(circumferenceoftherectangle);}}