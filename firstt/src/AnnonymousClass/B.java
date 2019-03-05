package AnnonymousClass;

public class B  {

	public static void main(String[] args) {
		//new implementation
		A m1=new A() {
			public void M1() {
				System.out.println("from B M1()");
			}
			
		};
	     m1.M1();
//	     m1.M2();
//	     m1.M3();
	     
	     //for old implementation
	     A m2=new A();
	     m2.M1();

	}

}
