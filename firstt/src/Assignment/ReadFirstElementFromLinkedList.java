package Assignment;

import java.util.LinkedList;

public class ReadFirstElementFromLinkedList {

	public static void main(String[] args) {
				
		LinkedList ls = new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println("Read First Element from Linked list");
		System.out.println(ls.getFirst());

	}

}
