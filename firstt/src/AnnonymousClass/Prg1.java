package AnnonymousClass;

public class Prg1 implements Interface1,Interface2 {
	
	public void run() {
		System.out.println("run()");
		
	}

	public static void main(String[] args) {
		
		Prg1 prg=new Prg1();
		prg.run();

	}

	
	

}
