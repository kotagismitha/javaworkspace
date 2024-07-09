/*33.For methodoverride concept,make parent method as final,check override is 
 * possible or not? (as per class 18)*/
package assignments;
class NoMain_class
{
final void message()
		{
			System.out.println(" I am a method from the parent class");
		}
}
	public class MakeParentClassAsFinal extends NoMain_class
	{
		                       void message() {
		 System.out.println(" I am a method from the child class");
		super.message();}
		public static void main(String[] args) {
		MakeParentClassAsFinal m1=new MakeParentClassAsFinal();
		 m1.message();}}









	

