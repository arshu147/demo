package firstt;

interface I1
{
	void add();
}

interface I2
{
	String add(String a);
}


public class ArshadSirQuestioninterface implements I1,I2 
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
		ArshadSirQuestioninterface a1 = new ArshadSirQuestioninterface();
		
		a1.add();
		System.out.println(a1.add("a"));
	}
		
}
