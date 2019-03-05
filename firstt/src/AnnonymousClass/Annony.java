package AnnonymousClass;

public  class Annony {

	public static void main(String[] args) {
		I1 i=new I1() {
			public	void run() {
				System.out.println("run()");
			
		}
		public void run2() {
			
			System.out.println("run2()");
			
		}

	};
	i.run();
	i.run2();
	
 }
}


