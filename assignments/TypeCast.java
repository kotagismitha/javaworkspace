/*52.Write a program give bigger int value and type cast int to byte
85.WAP to showcase the Widening typecasting*/
package assignments;

public class TypeCast 
{
public static void main(String args[])
{
	//int i = 84512312;
	byte b1= 127;
	int a= (int) b1;  //Explicit way- widening
	int b= b1;        //implicit way of widening
	System.out.println(b); 
	System.out.println(b1);
}
}
