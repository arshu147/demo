package Java_prog;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class P7
{

	 public static void main(String[] args) {
	 
	    // Create a LinkedList
	    LinkedList<String> list = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    list.add("manu");
	    list.add("tanu");
	    list.add("ashu");
	    list.add("raghu");
	    list.add("dev");
	    
	 
	    // Displaying LinkedList elements
	    System.out.println("LinkedList elements:");
	    Iterator it= list.iterator();
	    while(it.hasNext()){
	       System.out.println(it.next());
	    }
	 
	    // Obtaining Sublist from the LinkedList
	    List sublist = list.subList(1,4);
	 
	    // Displaying SubList elements
	    System.out.println("Sub List elements:");
	    Iterator subl= sublist.iterator();
	    while(subl.hasNext()){
	       System.out.println(subl.next());
	    }
	 }

}
