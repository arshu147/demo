package firstt;

 
    class AB
{
		 void run()
			{
				System.out.println("running run...");
			}
			
			
			 void go()
			{
				System.out.println("running go...");
			}
	}
    
    
    public class AnonymousC {
    	
  	  
  	  public static void main(String[] args) {
  			
  			
  			AB a = new AB()
  					{
  					
  						public void run()
  						{
  							System.out.println("running anonymous class...");
  						}
  					};
  			a.run();
  			
  			AB a2 = new AB();
  			a2.run();
  					
  	
  	  }
  		
}
