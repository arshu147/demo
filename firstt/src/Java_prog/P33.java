package Java_prog;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P33
{
	   public static void main(String args[])
	   {
	         HashMap<Integer, String> hmap= new HashMap<Integer, String>();
	         hmap.put(2, "manu");
	         hmap.put(3, "Ajit");
	         hmap.put(1, "raghu");
	         hmap.put(4, "Sachin");
	         hmap.put(5, "tanu");

	         Map map= Collections.synchronizedMap(hmap);
	         Set set = map.entrySet();
	         synchronized(map)
	         {
	             Iterator i = set.iterator();
	             while(i.hasNext())
	             {
	                Map.Entry me = (Map.Entry)i.next();
	                System.out.print(me.getKey() + ": ");
	                System.out.println(me.getValue());
	             }
	         }
	    }

}
