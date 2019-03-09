package firstt;

interface I4
{
	void add();
}

interface I3
{
	void add();
}

public class ArshadSirQuestion1interface implements I3, I4
{
	public void add()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) 
	{
		ArshadSirQuestion1interface a1 = new ArshadSirQuestion1interface();
		
		a1.add();
	}

}
