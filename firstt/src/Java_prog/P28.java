package Java_prog;

import java.util.TreeMap;

public class P28 
{
	 public static void main(String[] args) 
	    { 
	  
	        TreeMap<Integer, String> tm =  new TreeMap<Integer, String>(); 
	        tm.put(10, "manu"); 
	        tm.put(15, "tanu"); 
	        tm.put(20, "raghu"); 
	        tm.put(25, "dev"); 
	        tm.put(30, "abhi"); 
	
	        System.out.println("The original map is: "+ tm); 
	        System.out.println("The subMap is " +   tm.subMap(15, 30)); 
	    } 

}
