package Assignment;

import java.util.ArrayList;

public class CopyArrayListToArray {
	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		int count = al.size();
		int array[] = new int[count];
		for(int i =0 ;i<count;i++)
		{
			array[i] = al.get(i) ;
		}
		System.out.println("Converted Array ");
		for(int i =0 ;i<count;i++)
		{
			System.out.println(array[i]);
		}
	}

   }
