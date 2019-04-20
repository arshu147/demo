package Assignment;

import java.util.HashMap;
import java.util.TreeMap;

public class CopyOneMapToHashMap {

	public static void main(String[] args) {
	System.out.println("Tree Map");
     TreeMap tm = new TreeMap();
     tm.put(1, "Manju");
     tm.put(2, "Sanju");
     tm.put(3, "Mahesh");
     tm.put(4, "Dinesh");
     System.out.println(tm);
     System.out.println("Hash Map"); 
     HashMap hm = new HashMap(tm);
     System.out.println(hm);
     
	}

}
