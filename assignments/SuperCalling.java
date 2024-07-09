/*25.Write a program for super() calling statement for parameterized and 
non parameterized.*/
package assignments;
class SuperParent
{SuperParent(){
	 System.out.println("This is a parent class constructor");	}
SuperParent(int a, int b){
	System.out.println(a+b);}}
public class SuperCalling extends SuperParent{
	SuperCalling(){
		super(3,4);
		System.out.println("This is a child constructor");}
	SuperCalling(int q, int r){		
		//super();
	}
	public static void main(String[] args) {
		new SuperCalling();
	//new SuperCalling(0,0);
		}} 