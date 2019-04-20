package Java_prog;

import java.util.TreeMap;

public class P29
{
	 public static void main(String[] args) {

	      
	      TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

	      tm.put(2, "manu");
	      tm.put(1, "tanu");
	      tm.put(3, "raghu");
	      tm.put(6, "dev");
	      tm.put(5, "abhi");

	      System.out.println("First key is: "+ tm.firstKey());
	   }    
	}


