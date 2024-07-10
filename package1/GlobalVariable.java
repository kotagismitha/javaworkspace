package package1;

public class GlobalVariable 
{
static double pi= 3.14;   //gloabal variable  //area of circle= pi*r*r
static int Days_Of_NonLeapYear = 365;

static void area2()
{
	int r2=9;
	double a2= pi*r2*r2;
	System.out.println (a2);
	System.out.println (Days_Of_NonLeapYear);
}
public static void main(String[] args) 
{
	int a = 100;
	int b = 200;
	int r=7;
	double area= pi*r*r;
	System.out.println (area);
	area2();
}
}