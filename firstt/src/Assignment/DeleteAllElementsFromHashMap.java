package Assignment;

import java.util.HashMap;

public class DeleteAllElementsFromHashMap {
// Delete all the elements from Hash Map
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(2, "Aravind");
		hm.put(3, "Vignesh");
		hm.put(4, "Arun");
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
		
	}

}
