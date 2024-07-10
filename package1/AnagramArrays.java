package package1;

import java.util.Arrays;

public class AnagramArrays 
{
//angel-- angle
//ant--tan
//anagrams have same number of characters and same letters
	public static void main(String[] args) 
	{
		String s1= "tea1";
		String s2= "ate1";
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("After Sorting" + Arrays.toString(c1));
		System.out.println("After Sorting" + Arrays.toString(c2));
		boolean b1= Arrays.equals(c1, c2);
		if (b1==true)
			System.out.println("Given strings are anagrams");
		else
			System.out.println("Given strings are not anagrams");
	}
}
