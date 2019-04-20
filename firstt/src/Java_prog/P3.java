package Java_prog;

import java.util.ArrayList;

public class P3 {

	public static void main(String[] args)
	{
//copy arrayList to array
ArrayList al = new ArrayList<>();
al.add(10);
al.add("manu");
al.add('m');
Object [] ob=al.toArray();
for (int i = 0; i < ob.length; i++)
{
	System.out.println(ob[i]);
	
}
	}

}
