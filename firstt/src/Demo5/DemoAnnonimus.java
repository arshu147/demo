package Demo5;

public class DemoAnnonimus
{
	public static void main(String[] args) {
		
	
DemoAnnonimus2 i1=new DemoAnnonimus2() {
	
	@Override
	public void run1() {
		// TODO Auto-generated method stub
		System.out.println("Run");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run2");
	}
};

i1.run();
i1.run1();
	}
}
