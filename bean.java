import java.util.Scanner;
public class bean
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the number of balls to drop:");
		int n=input.nextInt();
		System.out.println("Enter the number of slots in the bean machine");
		int slots=input.nextInt();
		String[] var=new String[n];
		int[] balls=new int[n];
		int[] show_balls=new int[slots+1];
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<slots-1;j++)
			{
				int a=(int)(Math.random()*2);
				if(a==0)
				{
					if(var[i]==null)
					{
						var[i]="L";
					}
					else
					{
						var[i]=var[i]+"L";	
					}
					
				}
				else
				{
					if(var[i]==null)
					{
						var[i]="R";
					}
					else
					{
						var[i]=var[i]+"R";
						balls[i]++;
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			System.out.println(var[i]+" :"+balls[i]);
			if(balls[i]>max)
			{
				max=balls[i];
			}
		}
		
		for(int i=0;i<n;i++)
		{
			show_balls[balls[i]]=++show_balls[balls[i]];
		}
		for(int i=0;i<slots;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(show_balls[j]>0)
				{

				}
				System.out.print(" ");
				show_balls[balls[i]]=j;
				System.out.println(i+" "+j);
			}
		}
	}
}