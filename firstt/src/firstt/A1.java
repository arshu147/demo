package firstt;


interface If1
{
	void m1();
	void m2();
	
}

class A1
{
	public static void main(String[] args) {
		
	

	If1 i = new If1()
	{
		public void m1()
		{
			System.out.println("Hello");
		} 
		public void m2()
		{
			System.out.println("Bye");
		}
	};
	
	i.m1();
	i.m2();

	}
	
	
}

