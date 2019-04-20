package Java_prog;
import java.util.ArrayList;
public class P1 {

   public static void main(String a[])
   {
     ArrayList<String> al = new ArrayList<String>();

     //Adding elements to the ArrayList
     al.add("manu");
     al.add("tanu");
     al.add("raghu");
     al.add("ram");
     System.out.println(al);

     ArrayList<String> al2 = (ArrayList<String>)al.clone();
     System.out.println( al2);
    //add on original ArrayList
     al.add("dev");
    //Display of both ArrayLists after add & remove
     System.out.println(al);
     System.out.println(al2);
   }
}