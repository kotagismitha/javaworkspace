/*50.Write a addAll method(index int,collection c) program in Arraylist
(As per class 31)*/
package assignments;
import java.util.ArrayList;
public class Add_all {
	
public static void main(String[]args)
{
	ArrayList a1= new ArrayList();
	a1.add("Ramayana");
	a1.add("Mahabharatha");
	a1.add("Bible");
	a1.add("Quran");
	ArrayList a2= new ArrayList();
	a2.add("Hinduism");
	a2.add("Christianity");
	a2.add("Islam");
	a2.addAll(a1);
	//a2.remove(3);
	//a2.removeAll(a1);
	//a2.clear();
	boolean n= a2.contains("Bible");
	boolean m = a2.contains("Parasee");
	boolean l = a2.containsAll(a1);
	a2.add(5, "Bhagavadgeetha");
	System.out.println(a2);
	System.out.println(n);
	System.out.println(m);
	System.out.println(l);
}
}

