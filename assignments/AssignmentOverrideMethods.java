package assignments;
class newparent
{
	void display()
	{
	System.out.println ("I was called using super keyword and i am a method from the super class");
    }
}
public class AssignmentOverrideMethods extends newparent
{
	void display()
	{
		super.display();
		System.out.println ("I am a child class method");	
	}
	
public static void main(String[] args) 
{
	AssignmentOverrideMethods A1 = new AssignmentOverrideMethods();
	A1.display();
}
			
}
	

