package Demo5;

public class DemoAnnonimus4
{
	public static void main(String[] args) 
	{
		DemoAnnonimus3 ac=new DemoAnnonimus3()
				{
			public void run()
			{
				System.out.println("My name is pushpendra kumar Singh");
			}
			
				};
				
				ac.run();
				ac.run2();
				DemoAnnonimus3 ac1=new DemoAnnonimus3();
				ac1.run();
				
		
	}

}
