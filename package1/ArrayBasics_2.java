package package1;

import java.util.Arrays;

public class ArrayBasics_2
{
	public static void main(String[] args) 
	{
		int[]rollnos=new int[3];
		rollnos[0]=45;
		rollnos[1]=229;
		rollnos[2]=1023;
		//rollnos[3]=2129; //Eg of array out of bounds
		
		for(int i=0; i<3; i++)
		{
			System.out.println(rollnos[i]);
		}
		System.out.println(Arrays.toString(rollnos));
	}
}
