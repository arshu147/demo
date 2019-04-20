package Assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class CopyLinkedListToArray {

	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		System.out.println("LinkedList");
		System.out.println(lst);
		ArrayList al = new ArrayList(lst);
		System.out.println("ArrayList");
		System.out.println(al);
		
		

	}

}
