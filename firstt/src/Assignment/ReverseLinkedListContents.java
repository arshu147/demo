/* Reverse Linked list Content*/
package Assignment;

import java.util.LinkedList;

public class ReverseLinkedListContents {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		System.out.println(ls);
		LinkedList ls1 = new LinkedList();
		int count = ls.size();
		for(int i=count-1;i>=0;i--)
		{
			//System.out.println(ls.get(i));
			ls1.add(ls.get(i));
		}
		System.out.println("LinkedList in Reverse Order");
		System.out.println(ls1);
	}
	
	

}
