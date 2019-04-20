package Java_prog;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class P30
{
	 public static void main(String args[]) 
	    { 
	        
	      TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Collections.reverseOrder());

	      tm.put(2, "manu");
	      tm.put(1, "tanu");
	      tm.put(3, "raghu");
	      tm.put(6, "dev");
	      tm.put(5, "abhi");
	  
	 
	        Set set = tm.entrySet(); 
	        Iterator i = set.iterator(); 
	 
	        while (i.hasNext()) 
	        { 
	            Map.Entry me = (Map.Entry)i.next();
	            System.out.print(me.getKey() + ": "); 
	            System.out.println(me.getValue()); 
	        } 
	    } 

}
