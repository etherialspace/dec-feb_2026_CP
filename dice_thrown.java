public class dice_thrown
{
	public static void main(String[] args)
	{
		int[] dice={1,2,3,4,5,6};
		int size=dice.length;
		int count=1;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				for (int m=0;m<size;m++)
				{
					if(dice[i]+dice[j]+dice[m]==9)
					{
						count++;
						System.out.println("("+dice[i]+","+dice[j]+","+dice[m]+")");
					}
				}
			}
		}
		System.out.println("Total = "+count+" combinations");
	}
}