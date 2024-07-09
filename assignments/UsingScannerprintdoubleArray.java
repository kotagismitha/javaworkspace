//39.try to do indexing for double & boolean data types using scanner class
package assignments;
import java.util.Arrays;
import java.util.Scanner;
public class UsingScannerprintdoubleArray {
	public static void main(String[] args) {
 double d[]= new double[2];
	boolean[]b=new boolean[2];
 Scanner s1= new Scanner(System.in);
 for (int i=0;i<2;i++)
 {d[i]=s1.nextDouble();
   System.out.println(d[i]);
   System.out.println(b[i]);}
	System.out.println(Arrays.toString(d));}}

