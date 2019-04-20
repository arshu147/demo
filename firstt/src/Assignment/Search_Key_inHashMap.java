package Assignment;

import java.util.HashMap;

public class Search_Key_inHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Manju");
		hm.put(2, "Aravind");
		hm.put(3, "Vignesh");
		hm.put(4, "Arun");
		System.out.println(hm);
		System.out.println("search a key in HashMap");
		
      System.out.println(hm.containsKey(1));
	}

}
