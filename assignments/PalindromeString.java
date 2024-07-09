//43.Write a Program to reverse a string using iteration
package assignments;
public class PalindromeString {
	public static void main(String[] args) {
		String str="MyNameisBeautiful";
		for (int i=(str.length()-1);i>=0;i--)
		{
			char cStr=str.charAt(i);
			System.out.print(cStr);
		}
	}
}
