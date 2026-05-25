public class lockers
{
	public static void main(String[] args)
	{
		boolean[] locker_state=new boolean[100];
		//1st day done false

		for(int i=1;i<=100;i++)
		{
			if(i==1)
			{
				System.out.print("");
			}
			else if(i==2)
			{
				locker_state[i-1]=true;
			}
			else 
			{
				for(int j=i-1;j<=100;j=j+i)
				{
					
					if(locker_state[j]==true)
					{
						locker_state[j]=false;
					}
					else if(locker_state[j]==false)
					{
						locker_state[j]=true;
					}
					else
					{
						System.out.println("3rd locker state executed:Error!");
					}
				}
			}
		}
		for(int i=0;i<100;i++)
		{
			if(locker_state[i]==true)
			{
				System.out.println(i+1);
			}
		}
	}
}