package firstt;

interface I1
{
	void add();
}

interface I2
{
	String add(String a);
}


public class ArshadSirQuestion implements I1,I2 
{
	public void add()
	{
		System.out.println("Hi");
	}
	
	public String add(String a)
	{
		String s = "Swathi";
		return s;
	}
	
	public static void main(String[] args) 
	{
		ArshadSirQuestion a1 = new ArshadSirQuestion();
		
		a1.add();
		System.out.println(a1.add("a"));
	}
		
}
