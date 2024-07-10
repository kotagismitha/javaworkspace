package package1;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayintdatatype 
{
	public static void main(String[] args) 
	{
 int d[]= new int[3];
 Scanner s1= new Scanner(System.in);
 for (int i=0;i<3;i++)
 {
	 d[i]=s1.nextInt();
 System.out.println(d[i]);
 }
	System.out.println(Arrays.toString(d));
}
}
