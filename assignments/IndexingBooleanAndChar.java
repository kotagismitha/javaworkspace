//38.Try Out indexing and output for char and boolean
package assignments;
import java.util.Arrays;
public class IndexingBooleanAndChar {
		public static void main(String[] args) {
			char[]g=new char[3];
			g[0]='k';
			g[1]='l';
			g[2]='m';
			//g[3]='a'; //Eg of array out of bounds
			boolean[]b=new boolean[3];
			b[0]=true;
			b[1]=false;
			b[2]=true;
			for(int i=0; i<3; i++) {
			System.out.println(g[i]);
			System.out.println(b[i]);}}}
