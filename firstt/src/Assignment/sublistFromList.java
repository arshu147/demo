
/* How to get Sublist from a list */
package Assignment;
import java.util.ArrayList;
public class sublistFromList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("List");
		System.out.println(al);
		System.out.println("SubList from index 0 to index 3");
		
		System.out.println(al.subList(0, 3));
		

	}

}
