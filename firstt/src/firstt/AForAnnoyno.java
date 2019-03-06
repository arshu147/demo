package firstt;

public class AForAnnoyno {
	
	public static void main(String[] args) {
		
		TestAnnoy a1=new TestAnnoy () {
		
		public void A()
		{
			System.out.println("Second Implementation");
		}
		
	};
	
	a1.A();
	TestAnnoy v1=new TestAnnoy();
	v1.A();
	
	}

}
