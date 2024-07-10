/*44.Write a program to find out alphabets in a given string 
45.Write a program to find out whitespaces, numeric values and special 
characters in a given  string (Eg: Name123, 50cents) */
package assignments;
import java.util.Arrays;
public class FindAlphabetsInArray {
public static void main(String[] args) {
			String input="17 October";
			 int count_of_alpha=0;
			 int count_of_numeric=0;
			 int count_of_space=0;
int count_Of_SpecialCharacters=input.length()-(count_of_alpha+count_of_numeric+count_of_space);
			char c1[]=input.toCharArray();
			System.out.println(Arrays.toString(c1));
			for(int i=0;i<input.length();i++){
				boolean b1=Character.isAlphabetic(c1[i]);
				boolean b2=		Character.isDigit(c1[i]);
				boolean b3=		Character.isWhitespace(c1[i]);
				if(b1==true){
				count_of_alpha++;}
				if(b2==true){
				count_of_numeric++;}
				if(b3==true){
				count_of_space++;}}
System.out.println("Total number of aplhabets are -> "+count_of_alpha);
System.out.println("Total number of numeric are -> "+count_of_numeric);
System.out.println("Total number of spaces are -> "+count_of_space);
System.out.println("Total number of special characters are -> "+count_Of_SpecialCharacters);}}
