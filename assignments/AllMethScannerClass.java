//17.Utilise All methods of scanner class
package assignments;
import java.util.Scanner;
public class AllMethScannerClass {
   static void callscanmeth(){
	  Scanner s1=new Scanner(System.in);
	  int n=s1.nextInt(); //Reads integer values.
	  System.out.println (n);
	   float m=s1.nextFloat(); //Reads float value.
	   System.out.println (m);
	   double l=s1.nextDouble(); //Reads double value.
       System.out.println (l);
       boolean s=s1.nextBoolean(); //Reads boolean value.
       System.out.println (s);
       String r=s1.nextLine(); //Reads string value until newline character ('\n') is encountered.
       System.out.println (r);
	   String t=s1.next(); //Reads string value until space or newline character is encountered.
	   System.out.println (t);
   }
   public static void main(String[] args) 
   {
	   callscanmeth();
   }
   
}
