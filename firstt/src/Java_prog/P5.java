package Java_prog;

import java.util.ArrayList;
import java.util.Collections;

public class P5 {

	public static void main(String[] args)
	{
		//swapping in arrayList
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(20);
		System.out.println("before swapping");
		System.out.println(al);
		Collections.swap(al, 1, 2);
		System.out.println("after swapping");
		System.out.println(al);
	}

}
