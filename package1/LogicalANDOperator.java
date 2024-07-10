package package1;

public class LogicalANDOperator {
	public static void main(String[] args)
	{
		int age=17;
		char gender='F';
		if (age>=19 && gender=='M')
		{
			System.out.println("full ticket");
		}
		if (!(age>=18 ||gender=='F'))
		{
			System.out.println("Free ticket");
		}
		if (!(age<=4 && gender=='M'))
		{
			System.out.println("Free tikcet")	
		}
	}
}

