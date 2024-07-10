package package1;

import java.util.Arrays;

public class ArrayBasics_Class1 {
	public static void main(String[] args) 
	{
		String[]name=new String[3];
		name[0]="Arbind";
		name[1]="Bhavani";
		name[2]="Ganesh";
		name[3]="Manish"; //Eg of array out of bounds
		
		for(int i=0; i<3; i++)
		{
			System.out.println(name[i]);
		}
		System.out.println(Arrays.toString(name));
	}

}
