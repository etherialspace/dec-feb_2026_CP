import java.util.Scanner;
public class largest_block
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows in the matrix ");
		Scanner input=new Scanner(System.in);

		int rows=input.nextInt();
		int[][] arr=new int[rows][rows];
		System.out.println("Enter the matrix row by row");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				arr[i][j]=input.nextInt();
			}

		}
		// for(int i=0;i<rows;i++)
		// {	
		// 	int count=0;
		// 	for(int j=i;j<rows-1;j++)
		// 	{
		// 		if(arr[i][j]==arr[i][j+1])
		// 		{
		// 			count++;
		// 		}
		// 	}
		// 	if(count==rows-i)
		// 	{
		// 		int lower_count=0;
		// 		for(int j=i;j<rows-1;j++)
		// 		{
		// 			if(arr[j][i]==arr[j+1][i])
		// 			{
		// 				lower_count++;
		// 			}
		// 		}
		// 		if(lower_count==count)
		// 		{
		// 			System.out.println("The maximum square submatrix is at ("+i+","+i+") with size "+(rows-i+1));
		// 			break;
		// 		}
		// 	}
		// }
		for(int j=0;j<rows;j++)
		{
			int count=0;
			for(int m=j+1;m<rows;m++)
			{	
				if(arr[j][j]==arr[j][m])
				{	

					count++;
				}
			}
			print(count);
			print(rows-j-1);
			if(count==rows-j-1)
			{
				System.out.println("The maximum square submatrix is at ("+(j)+","+(j)+") with size "+(rows-j));
				return;
			}
		}
		

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void print(int num)
		{
			System.out.println(num);
		}
}