package firstt;

public class Anoynew {

	public void run()
	{
		System.out.println("run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anoynew a1=new Anoynew() {
			public void run()
			{
				System.out.println("second Implementation");
			}
			
		};
		a1.run();
	}

}
