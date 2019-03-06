package firstt;

interface I4
{
	void add();
}

interface I3
{
	void add();
}

public class ArshadSirQuestion1 implements I3, I4
{
	public void add()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) 
	{
		ArshadSirQuestion1 a1 = new ArshadSirQuestion1();
		
		a1.add();
	}

}
