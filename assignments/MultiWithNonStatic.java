//21.Multi level inheritance for Nonstatic method
package assignments;
class browser1{
void chrome(){
	System.out.println("chrome");}}
class browser2 extends browser1{
	void firefox(){
		System.out.println("firefox");}}
public class MultiWithNonStatic extends browser2{
void listofbrowsers(){
	System.out.println("I inherit the following browsers from my ancestors");	}
public static void main(String[] args){
		MultiWithNonStatic m1= new MultiWithNonStatic();
		m1.listofbrowsers();
		m1.chrome();
		m1.firefox();}}


