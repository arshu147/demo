
/* Clone or copy Array list to another */
package Assignment;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lst = new ArrayList();
		lst.add(10);
		lst.add("Name");
		lst.add(true);
		System.out.println("************Original List************");
		System.out.println(lst);
		System.out.println("************Cloned List**************");
		ArrayList clist = (ArrayList) lst.clone();
		
		System.out.println(clist);
		
	}

}
