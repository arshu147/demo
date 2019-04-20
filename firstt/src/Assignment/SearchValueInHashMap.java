package Assignment;

import java.util.HashMap;

public class SearchValueInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(1, "Manju");
		hm.put(2, "Aravind");
		hm.put(3, "Vignesh");
		hm.put(4, "Arun");
		System.out.println(hm);
		System.out.println("search a value in HashMap");
		System.out.println(hm.containsValue("Aravind"));

	}

}
