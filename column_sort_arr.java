import java.util.Scanner;
public class column_sort_arr
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Type size");
		int size=input.nextInt();
		double[][] arr=new double[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=input.nextDouble();
			}
		}
		System.out.println("Choose b/w 1 for row or 2 for column sorting");
		int sort=input.nextInt();
		if(sort==1)//column sorting
		{
			for(int j=0;j<size;j++)
			{
				for(int i=0;i<size-1;i++)
				{
					for(int m=0;m<size-1;m++)
					{	
						
						if(arr[m][j]>arr[m+1][j])
						{	
							double temp=arr[m][j];
							arr[m][j]=arr[m+1][j];
							arr[m+1][j]=temp;
						}
					}
				}
			}
			System.out.println("The column-sorted array is");
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		else if(sort==2)//row sorting
		{
			for(int j=0;j<size;j++)
			{
				for(int i=0;i<size-1;i++)
				{
					for(int m=0;m<size-1;m++)
					{	
						if(arr[j][m]>arr[j][m+1])
						{	
							double temp=arr[j][m];
							arr[j][m]=arr[j][m+1];
							arr[j][m+1]=temp;
						}
					}
				}
			}
			System.out.println("The row-sorted array is");
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Wrong choice Retype!");
		}
	}	
}