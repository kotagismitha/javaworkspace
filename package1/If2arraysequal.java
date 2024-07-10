package package1;
import java.util.Arrays;
public class If2arraysequal {

	public static void main(String[] args) 
	{
 String name[]= new String[3];
 name[0]="Anita";
 name[1]="Bhanu";
 name[2]="Chandana";
 String name1[]= new String[3];
 name1[0]="Anita";
 name1[1]="Bhanu";
 name1[2]="Chandana";
 System.out.println(Arrays.equals(name, name1));
	}
}
