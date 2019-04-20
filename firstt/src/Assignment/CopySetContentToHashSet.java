package Assignment;

import java.util.HashSet;
import java.util.TreeSet;

public class CopySetContentToHashSet {

	public static void main(String[] args) {
	
		TreeSet ts = new TreeSet();
		ts.add(10);
	    ts.add(20);
		ts.add(30);
		ts.add(40);
		System.out.println("elements in TreeSet");
		System.out.println(ts);
		HashSet hs = new HashSet(ts);
		System.out.println("elements in HashSet");
		System.out.println(hs);
		

	}

}
