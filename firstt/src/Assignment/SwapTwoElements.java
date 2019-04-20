
/* Swapping two elements in ArrayList */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("Before SWapping");
		System.out.println(al);
		
	    Collections.swap(al, 0, 2);
	    
	   System.out.println("After SWapping");
	   System.out.println(al);
	  

	}

}
