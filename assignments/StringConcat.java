/*46.Write a Concatination program using with firstname and 
lastname(As per class25)*/
package assignments;

import java.util.Arrays;

public class StringConcat 
{
	public static void main(String[] args) 
	{
String Fname="Shri";
String Lname ="Ram";
System.out.println(Fname.concat(" ").concat(Lname));
String Sentence ="My name is Ram";
String a1[] = Sentence.split(" ");
String b1[]=Sentence.split(" ", 2); //two parts(one comma)
System.out.println(a1.length); //Displays number of words in a sentence different from the length()
System.out.println(Arrays.toString(a1));
System.out.println(Arrays.toString(b1));
}
}
