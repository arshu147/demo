package log4;

public class Debugg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					if(k==2)
					{
						System.out.println(i);
						break;
					}
				}
			}
		}

	}

}
