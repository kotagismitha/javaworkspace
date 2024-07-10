package package1;
class Alphabet_Auth
{
static void auth1()	
{
	System.out.println("Auth1")	;
}
class Amz_Google_Auth extends Alphabet_Auth
{
	static void auth2()	
	{
		System.out.println("Auth2")	;	
	}
}

public class Multilevel_Amazon extends Amz_Google_Auth
{
	static void auth3()	
	{
	System.out.println("Auth3")	;
	}
}
public static void main(String[] args) 
{
auth1();
auth2();
auth3();
}
}


