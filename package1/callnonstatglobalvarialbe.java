package package1;

public class callnonstatglobalvarialbe {
int no_of_days_non_leap_year = 365;
static String name;
static double s1;
public static void main(String[] args) 
{
	callnonstatglobalvarialbe rv = new callnonstatglobalvarialbe ();
	System.out.println(rv.no_of_days_non_leap_year);
	rv.no_of_days_non_leap_year =366;
	System.out.println(rv.no_of_days_non_leap_year);
	System.out.println(s1);
	System.out.println(name);
}
}
