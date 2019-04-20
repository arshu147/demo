package Assignment;

import java.util.TreeMap;

public class SerachValueInTreeMap {

	public static void main(String[] args) {
		TreeMap hm = new TreeMap();
		hm.put(1, "Manju");
		hm.put(2, "Aravind");
		hm.put(3, "Vignesh");
		hm.put(4, "Arun");
		System.out.println(hm);
		
		System.out.println(hm.containsValue("Arun"));
	}

}
