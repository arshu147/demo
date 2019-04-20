package Java_prog;

import java.util.HashMap;

public class P14
{
	  public static void main(String args[])
	  {
	        HashMap<Integer, String> hm = new HashMap<Integer, String>();
	        
	        hm.put(1, "manu ");
	        hm.put(2, " tanu");
	        hm.put(3," raghu");
	        System.out.println(hm);
	        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	        hm2.put(4, "S1 VALUE");
	        hm2.put(5, "S2 VALUE");
	        hm.putAll(hm2);
	        System.out.println(hm);
	    }

}
