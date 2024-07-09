//20.Multi level inheritance for static method
package assignments;
import java.util.Scanner;
class Username{
static void user(){
	Scanner s1=new Scanner(System.in);
	System.out.println("Provide username to login");
	String name = s1.next();
	System.out.println("The username to login is");
	System.out.println(name);}}
class Credentials extends Username{
	static void passcode(){
		Scanner s2=new Scanner(System.in);
		System.out.println("Provide password to login");
		String pass = s2.next();
	System.out.println("The password to login is");
	System.out.println(pass);}}
public class MultilevelWithStatic extends Credentials {
	static void login (){
		System.out.println("User is able to login successfully");}
	public static void main(String[] args){
		user();	
		passcode();
		login ();}}
