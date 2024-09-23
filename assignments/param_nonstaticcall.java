package assignments;

public class param_nonstaticcall {

void add (double a, int b)
{
	double sum =a+b;
	System.out.println (sum);	
}
void subtract ()
{
	System.out.println ("subtracting"); 
}

public static void main(String[] args) {
	param_nonstaticcall p1= new param_nonstaticcall();
	p1.add(4.32, 130);
	param_nonstaticcall p2 = new param_nonstaticcall();
	p2.subtract();
	
}
}
