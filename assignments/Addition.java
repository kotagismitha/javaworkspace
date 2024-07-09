/*1.Write a program to perform addition,subtraction,multiplication,
division and modulus in the main method
2.call a static method
3.call multiple  static method */
package assignments;
public class Addition 
{
	static void add()
	{
		int no1=30;
		double no2=40.90;
		double sum=no1+no2;
		System.out.println(sum);
		
	}
	static void sub()
	{
		int no1=40;
		int no2=20;
		int subtract=no1-no2;
		System.out.println(subtract);
		
	}
	static void multiply()
	{
		int no1=40;
		int no2=20;
		int multi=no1*no2;
		System.out.println(multi);
		
	}
	static void divide()
	{
		int no1=40;
		int no2=20;
		int divi=no1/no2; //4/2,Q=2,R=0,20/10
		System.out.println(divi);
		
	}
	static void modulus()
	{
		int no1=29;
		int no2=20;
		int mod=no1%no2; //4/2,Q=2,R=0,20/10
		System.out.println(mod);
		
	}
public static void main(String[] args) 
{
	add();
	sub();
	multiply();
	 divide();
	 modulus();
}
}
