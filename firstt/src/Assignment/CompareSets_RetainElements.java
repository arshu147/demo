package Assignment;

import java.util.TreeSet;

public class CompareSets_RetainElements {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
	    ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(500);
		ts.add(60);
		System.out.println("elements in first TreeSet"); System.out.println(ts);
				TreeSet ts1 = new TreeSet();
		ts1.add(10);
	    ts1.add(20);
		ts1.add(30);
		ts1.add(40);
		System.out.println("elements in second TreeSet"); System.out.println(ts1);
		ts.retainAll(ts1);
		System.out.println(ts);
		System.out.println(ts1);
		

	}

}
