package Assignment;

import java.util.ArrayList;
import java.util.TreeSet;

public class DeleteDUplicateEntryFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList ();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println(al);

		TreeSet ts = new TreeSet(al);
		System.out.println(ts);
		
		
	}

}
