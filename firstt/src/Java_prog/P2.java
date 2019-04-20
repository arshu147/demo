package Java_prog;

import java.util.ArrayList;
import java.util.List;

public class P2 
{

	public static void main(String[] args)
	{
		List al = new ArrayList<>();
		al.add(10);
		al.add("manu");
		al.add('m');
		ArrayList al2=new ArrayList<>(al);
		al2.add(20);
		if (al2.containsAll(al))
		{
			System.out.println("ArrayList contains all List element");
			
		}
		else 
		{
			System.out.println("ArrayList does not contains all List element");
		}
	}

}
