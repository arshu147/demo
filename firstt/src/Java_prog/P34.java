package Java_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P34 
{
	 public static void main(String a[])
	 {
         
	        List<Integer> al = new ArrayList<Integer>();
	        al.add(23);
	        al.add(44);
	        al.add(12);
	        al.add(45);
	        al.add(2);
	        al.add(16);
	        System.out.println("Maximum element from the list: " +  Collections.max(al));
	    }

}
