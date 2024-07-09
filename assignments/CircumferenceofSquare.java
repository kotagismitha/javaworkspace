/*18.Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, 
Circumferance of reactangle, Circumferance of trinagle, Circumferance of trepezium)*/
package assignments;
import java.util.Scanner;
public class CircumferenceofSquare {
	public static void main(String[] args) 
	{
		Scanner s2= new Scanner(System.in);
		System.out.println("provide the lenghts of 4 sides of the square");	
		double a = s2.nextDouble();
		double b = s2.nextDouble();
		double c = s2.nextDouble();
		double d = s2.nextDouble();
		System.out.println("The lenghts of the sides of the square are ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		double circumferenceofthesquare = a+b+c+d;
		System.out.println("The circumference of the square is ");
		System.out.println(circumferenceofthesquare);} }

