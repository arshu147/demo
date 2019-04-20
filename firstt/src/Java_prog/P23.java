package Java_prog;

import java.util.TreeMap;

public class P23
{
	 public static void main(String a[])
	 {
	        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
	        hm.put(1, "manu");
	        hm.put(2, "tanu");
	        hm.put(3,"raghu");
	        System.out.println(hm);
	        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	        tm.put(4, "dev");
	        tm.put(5, "abhi");
	        hm.putAll(tm);
	        System.out.println(hm);
	    }

}
