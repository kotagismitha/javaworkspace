package assignments;
import java.util.Scanner;
public class Swithccase 
{
public static void main (String args[])
{
	System.out.println("Press 1 for chrome browser");
	System.out.println("Press 2 for Firefox browser");
	System.out.println("Press 3 for Safari browser");
	System.out.println("Press 4 for edge browser");
	Scanner s1= new Scanner(System.in);
	int value=s1.nextint();
	switch(value)
	{
	case 1:
	{
		System.out.println("Chrome is launched ");
		break;
	}
	case 2:
	{
		System.out.println("Firefox is launched ");
		break;
	}
	case 3:
	{
		System.out.println("Safari is launched ");
		break;
	}
	case 4:
	{
		System.out.println("Safari is launched ");
		break;
	}
	}
}
}
