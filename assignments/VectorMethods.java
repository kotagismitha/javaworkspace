/*49.Write a -all method program for ArrayList,LinkedList,Vector,Priority 
Queue,HashSet,treeSet,LinkedHashSet and check wheather it is accepting Index,
Null,Duplicate,Sort, Order of index,Dynamic,Hetrogenius values(As per class30)*/
package assignments;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class VectorMethods
{
	public static void main(String[] args)
	{
ArrayList a1 = new ArrayList();
a1.add("Ram");
a1.add("Ram");
a1.add("Vamshi");
a1.add("Arvind");
a1.add("Ashwath");
a1.add("1987");
a1.add("water");
a1.add("water");
a1.add(null);
a1.add(true);
a1.add('c');
a1.add(" ");
System.out.println(a1);
LinkedList q1= new LinkedList();
q1.add("see");
q1.add("you");
q1.add("you");
q1.add("soon");
q1.add(null);
q1.add(" ");
System.out.println(q1);
Vector v1= new Vector();
v1.add("My");
v1.add(" ");
v1.add(null);
v1.add("My");
PriorityQueue p1=new PriorityQueue();
p1.add("JRE");
p1.add("jdk");
p1.add("JIT");
p1.add("JVM");
p1.add("JVM");
p1.add(" ");
//p1.add(null);
//p1.addAll(v1);
System.out.println(p1);
System.out.println(v1);
	}
}

