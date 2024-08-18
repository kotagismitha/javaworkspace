package assignments;

import java.util.Date;

public class Time 
{
public static void main(String args[])
{
	Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2=new Date(d1.getTime());
	String human= d2.toString();
	String day = human.substring(8,10);
	String month = human.substring(4,7);
	String year = human.substring(23, 28);
	System.out.println("Current Time " +human);
	System.out.println("Current Time " +d2);
	System.out.println("Current day " +day);
	System.out.println("Current date " +month);
	System.out.println("Current year " +year);
	
	Date d3=new Date(d1.getTime()+(1000*60*60*24*49)); //ms*hh*mm*ss*numofhoursinaday*numofdays
	System.out.println("Future Time " +d3);
	Date d4=new Date(d1.getTime()-(1000*60*60*24*5)); //ms*hh*mm*ss*numofhoursinaday*numofdays
	System.out.println("Past Time " +d4);
	//System.out.println(date.concat('/'))
}
}
