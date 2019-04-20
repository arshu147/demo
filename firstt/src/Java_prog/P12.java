package Java_prog;

import java.util.HashSet;
import java.util.Set;

public class P12
{
	public static void main(String a[])
	{
        Set<String> hs = new HashSet<String>();
        hs.add("manu");
        hs.add("tanu");
        hs.add("raghu");
        hs.add("dev");
        System.out.println(hs);
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("s1");
        hs2.add("s2");
        hs.addAll(hs2);
        System.out.println("HashSet content after adding");
        System.out.println(hs);
    }

}
