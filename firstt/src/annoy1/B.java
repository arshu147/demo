package annoy1;

public class B {
	
	public static void main(String[] args) {
		A a=new A() {
			public void run()
			{
				System.out.println("from B class");
			}
		};
		a.run();// for this  we can get the new implementation, which is present in the annonymeous class
		//a.run1();
		//a.run2();
		A a1=new A();
		a1.run(); // for this , we will 
		
	}
	

}
