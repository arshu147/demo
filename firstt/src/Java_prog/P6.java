package Java_prog;
import java.util.Arrays;
import java.util.LinkedList; 
public class P6 
{
    //converting linked list to array

	public static void main(String args[])
	{ 
		
		// creating and initializing a LinkedList of String 
		LinkedList<String> list1 = new LinkedList<>(); 
		
		list1.add("manu"); 
		list1.add("tanu"); 
		list1.add("raghu"); 
		// printing the contents of LinkedList before conversion
		System.out.println("LinkedList: " + list1); 
		for (String str : list1) 
		{
			System.out.println(str);
		}
		// Converting the LinkedList to array
		String[] arr = list1.toArray(new String[list1.size()]);
		// printing contents of array after conversion 
		System.out.println("String array: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}
}