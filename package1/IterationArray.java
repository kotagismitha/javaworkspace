//42.Write the value of one array in to another through iteration
package package1;
import java.util.Arrays;
public class IterationArray {
	public static void main(String[] args) {
		int input[]=new int[3];
		input[0]=89;
		input[1]=21;
		input[2]=63;
		int output[]=new int[3];	
	for (int i=0;i<=2;i++){
	output[i]=input[i];}
	System.out.println(Arrays.toString(input));
	System.out.println(Arrays.toString(output));}}
