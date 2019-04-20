package Java_prog;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P32
{
	 public static void main(String a[]){
         
	        Set<String> ss = new HashSet<String>();

	        ss.add("manu"); 
	        ss.add("tanu"); 
	        ss.add("raghu");
	        Set<String> sysSet = Collections.synchronizedSet(ss);
	        System.out.println(sysSet);
	    }

}
