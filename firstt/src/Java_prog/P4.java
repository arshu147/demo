package Java_prog;

import java.util.ArrayList;
import java.util.Collections;

public class P4
{
	public static void main(String[] args)
	{
ArrayList al = new ArrayList<>();
al.add(10);
al.add("manu");
al.add('m');
Collections.shuffle(al);
for (Object ob : al)
{
	System.out.println(ob);
	
}
	}

}
