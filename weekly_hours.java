public class weekly_hours
{
	public static void main(String[] args)
	{
		int[][] arr={
			{2,4,3,4,5,8,8},
			{7,3,4,3,3,4,4},
			{3,3,4,3,3,2,2},
			{9,3,4,3,3,2,2},
			{3,5,4,3,6,3,8},
			{3,4,4,6,3,4,4},
			{3,7,4,8,3,8,4},
			{6,3,5,9,2,7,9}
		};
		System.out.println("Computing weekly hours by each empolyee");
		int hours=0;
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<7;j++)
			{
				hours+=arr[i][j];
			}
			System.out.println("Employee "+i+": "+hours);
			hours=0;
		}
	}
}