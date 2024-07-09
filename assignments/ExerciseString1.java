//first method learnt on String class-length
//Write a program for all methods of String length,lowercase,
//uppercase,indexofchar,charAt(index),trim,equals,equalsignorecase,
//contains,substring(start index),substring(startindex,endindex)      
package assignments;

public class ExerciseString1 
{
	public static void main(String[] args) 
	{
	String name="smitha";
	int a = name.length();
	System.out.println(a);
	System.out.println(name.length());
	String name2= "School name is Vidya";
	int b=name2.length();
	System.out.println(b);
	System.out.println(name.toUpperCase());
	System.out.println(name2.toLowerCase());
	System.out.println(name.charAt(0));
	System.out.println(name2.charAt(3));
	System.out.println(name2.indexOf('n'));
	System.out.println(name.indexOf('i'));
	String name1= "    SpacesAttheBeginning";
	String nam = "Spaceattheend           ";
	System.out.println(name1.trim());
	System.out.println(nam.trim());
	String a1= "SIGNATURE";
	String b1= "SIGNATURE   ";
	String c1= "SignAture";
	//boolean is the return type of a equals method
	System.out.println(a1.equals(b1));
	System.out.println(a1.equals(c1));
	System.out.println(a1.equalsIgnoreCase(c1));
	System.out.println(a1.equalsIgnoreCase(b1));
	System.out.println(a1.contains("SIGN"));
	System.out.println(nam.contains("SIGN"));
	System.out.println(nam.substring(4));
	//Substring with 2 params
	System.out.println(nam.substring(1,5)); //Displays strings at position 1,2,3,4
	}
}
