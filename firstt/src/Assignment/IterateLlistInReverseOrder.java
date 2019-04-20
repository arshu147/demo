package Assignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateLlistInReverseOrder {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println("List in Reverse order");
				
		Collections.reverse(ls);
		Iterator i = ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
