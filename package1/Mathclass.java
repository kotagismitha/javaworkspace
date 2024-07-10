package package1;

public class Mathclass   
{
	public static void main(String[] args) 
	{
		double pi = Math.PI;
		int r= 10;
		double area= pi*r*r;
		System.out.println(area);
		System.out.println(Math.addExact(9980, 20));  //classname.methodname
		System.out.println(Math.addExact(2345678, 0123456));
		System.out.println(Math.subtractExact(1000, 900));
		System.out.println(Math.subtractExact(2345678, 0123456)); //always first num-second num
		System.out.println(Math.subtractExact(1000, 1900));
		System.out.println(Math.multiplyExact(45, 67));
		System.out.println(Math.max(34, 33));
		System.out.println(Math.max(3.2, 0.9));
		System.out.println(Math.min(9, 2));
		System.out.println(Math.min(2.54, 9.080));
		System.out.println(Math.sqrt(81));
		int no1 = Math.abs(-75);
		System.out.println(Math.sqrt(no1));
		System.out.println(Math.random());
		
		
		
	}

}
