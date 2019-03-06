package firstt;

interface Job
{
	void noJob();

	void noVacancy();
}

class anonymous
{
	public static void main(String[] args) 
	{

		Job j = new Job() {
			public void noVacancy()
			{

				System.out.println("Hi");
			}


			public void noJob()
			{
				System.out.println("Bye");


			}
		};
		
		j.noVacancy();
		j.noJob();

	}
}