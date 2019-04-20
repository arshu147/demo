     //reverse an arrayList
package Java_prog;

import java.util.ArrayList;
import java.util.Collections;

public class P8 
{
	public static void main(String[] args)
	{
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(20);
		System.out.println("before rev");
		System.out.println(al);
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println("after rev");
		System.out.println(al);
	}

}
