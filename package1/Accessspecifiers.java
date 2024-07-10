//27.Write a program for what happens within class 
package package1;
public class Accessspecifiers 
{public static void add(){
		System.out.println("from public method");}
	protected static void sub(){
		System.out.println("from protected method");}
	private static void mul(){
		System.out.println("from private method");}
	 static void divide(){
			System.out.println("from default method");}	
public static void main(String[] args) {
	divide();
	add();
	sub();
	mul();	}	}
