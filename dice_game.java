public class dice_game
{
	public static void main(String[] args)
	{	
		int win=0;
		int lose=0;
		int n1;int n2;int sum;
		for(int i=0;i<15000;i++)
		{	
			n1=random_num_generate();
			n2=random_num_generate();
			sum=n1+n2;
			
			if(sum==7||sum==11)
			{
				win++;
			}
			else if (sum==2 || sum==3 || sum==12)
			{
				lose++;
			}
			else
			{	
				n1=random_num_generate();
				n2=random_num_generate();
				int sum1=n1+n2;
				if(sum1==sum)
				{
					win++;
				}
				else 
				{
					lose++;
				}
			}
		}
		System.out.println("Won in "+win+" games.");
	}
	public static int random_num_generate()
	{
		double m=Math.random();
		return (int)( m*6 + 1);
	}
}