package firstt;

class A
{
	void run()
	{
		System.out.println("Running");
	}
	
	void run1()
	{
		System.out.println("Running Running");
	}
}

public class anonymous1 
{
	public static void main(String[] args) 
	{
		A a = new A(){
			
			public void run()
			{
				System.out.println("Running Running Run");
			}
			
		};
		a.run();
		
		A a1 = new A();
		a1.run();
		a1.run1();
		
	}

}
