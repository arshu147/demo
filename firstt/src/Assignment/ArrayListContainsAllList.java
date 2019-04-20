
/* program to check list contains all elements of the list*/
package Assignment;

import java.util.ArrayList;

public class ArrayListContainsAllList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(90);
		al.add(90);
		
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(50);
		al2.add(80);
		al2.addAll(al);
		
		
		System.out.println(al2);
		
		System.out.println(al2.containsAll(al));
		
	}

}
