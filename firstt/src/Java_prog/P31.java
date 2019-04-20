package Java_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class P31 
{
	 public static void main (String[] args) 
	    { 
	        List<String> list = Collections.synchronizedList(new ArrayList<String>()); 
	  
	        list.add("manu"); 
	        list.add("tanu"); 
	        list.add("raghu"); 
	  
	        synchronized(list) 
	        { 
	   
	            Iterator it = list.iterator(); 
	  
	            while (it.hasNext()) 
	            {
	                System.out.println(it.next()); 
	            }
	        } 
	    } 

}
