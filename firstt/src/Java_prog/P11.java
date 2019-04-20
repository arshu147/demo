package Java_prog;

import java.util.Iterator;
import java.util.LinkedList;

public class P11 
{
	public static void main(String a[]){

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("manu");
        ll.add("tanu");
        ll.add("raghu");
        ll.add("dev");
        Iterator<String> r = ll.descendingIterator();
        while(r.hasNext())
        {
            System.out.println(r.next());
        }

}
}
