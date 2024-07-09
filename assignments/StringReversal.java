//40,41 : String reversal and palindrome
//madam, malayalam, wow, mom, dad, sms, radar
package assignments;
public class StringReversal {
	public static void main(String[] args) {
		String input ="Curie";
		String output=""	;	
for (int i=input.length()-1;i>=0;i--)
{char c1=input.charAt(i);
	//System.out.print(c1);
	output=output+c1;	}
System.out.println(output);
if (input.equals(output)){
		System.out.println("The given string is a palindrome");}
		else{
			System.out.println("The given string is not a palindrome");	}}}


