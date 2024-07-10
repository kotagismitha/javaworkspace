package package1;

public class NestedIFelse {
	public static void main(String[] args)
	{
		char gender_1= 'M';
		char gender_1= 'F';
		int age_kid = 4;  //ticket is free
		int age_adult_male = 32; //full ticket
		int age_adult_female = 30;
		if (gender_1=='M')
		{
			if(age_kid<=4)
		{
				System.out.println ("ticket is free");
		}
			else
			{
				System.out.println ("pay full ticket price");
			}
	}
	else
	{
		System.out.println ("ticket is free");
	}
}
}

