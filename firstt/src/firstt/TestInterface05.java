package firstt;

public class TestInterface05 {

	public static void main(String[] args) {
		
		Interface05 i1=new Interface05() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run");
				
			}

			@Override
			public void run2() {
				// TODO Auto-generated method stub
				
				System.out.println("run2");
			}
				
		};
		i1.run();
		i1.run2();
				
	}
	

}
