//26.Write a program for this() calling statement.
package assignments;
public class StatementThis {
	StatementThis(){
		this(12, 98);
		System.out.println("This is a parent method constructor");}
	StatementThis(int a, int b){
		this("New", "Bike");
		System.out.println(a+b);	}
	StatementThis(String a, String b){
		this('Q','M');
		System.out.println(a+b);	}
	StatementThis(char a, char b){
		this(3.14, 9.98);
		System.out.println(a+b);}
	StatementThis(double a, double b){
		this(2019);
		System.out.println(a+b);	}
	StatementThis(int yearofbirth){
		System.out.println(yearofbirth);	}
	public static void main(String[] args) {
		new StatementThis();}}
