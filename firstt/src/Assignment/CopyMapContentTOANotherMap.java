package Assignment;

import java.util.HashMap;
import java.util.TreeMap;

public class CopyMapContentTOANotherMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(1, "Manju");
		hm.put(2, "Aravind");
		hm.put(3, "Vignesh");
		hm.put(4, "Arun");
		System.out.println(hm);
		TreeMap tm = new TreeMap(hm);
		System.out.println(tm);

	}

}
