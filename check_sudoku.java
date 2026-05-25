import java.util.Scanner;

public class check_sudoku
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int block_size=9;

		int[][][] input_arr=new int[9][3][3];
		int[][][] arr={
			{
				{5,3,0},
				{6,0,0},
				{0,9,8}
			},
			{
				{0,7,0},
				{1,9,5},
				{0,0,0}
			},
			{
				{0,0,0},
				{0,0,0},
				{0,6,0}
			},
			{
				{8,0,0},
				{4,0,0},
				{7,0,0}
			},
			{
				{0,6,0},
				{8,0,3},
				{0,2,0}
			},
			{
				{0,0,3},
				{0,0,1},
				{0,0,6}
			},
			{
				{0,6,0},
				{0,0,0},
				{0,0,0}
			},
			{
				{0,0,0},
				{4,1,9},
				{0,8,0}
			},
			{
				{0,0,0},
				{0,0,5},
				{0,7,9}
			}
		};

		//Displaying given sudoko 
		System.out.println("Solve it!");
		display_arr(arr);

		System.out.println("Input array");
		for(int i=0;i<9;i++)
		{
			// System.out.println("Type Block "+i);
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					input_arr[i][j][k]=input.nextInt();
				}
			}
		}
		//Displaying entered sudoku
		display_arr(input_arr);
		boolean check=sudoku(input_arr);
		if(check==false)
		{
			System.out.println("Not sudoku");
		}
		else
		{
			System.out.println("Yes sudoku");
		}
		
	}
	public static boolean sudoku(int[][][] arr)
	{
		int sum=0;
		boolean check=true;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum=sum+arr[i][j][k];
				}
			}
			if(sum!=45)
			{
				check =false;
			}
			sum=0;
		}
		return check;
	}
	public static void display_arr(int[][][] arr)
	{
		
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(arr[i][j][k]+"|");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int j=0;j<3;j++)
		{
			for(int i=3;i<6;i++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(arr[i][j][k]+"|");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int j=0;j<3;j++)
		{
			for(int i=6;i<9;i++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(arr[i][j][k]+"|");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	//input 5 3 4 6 7 2 1 9 8 6 7 8 1 9 5 3 4 2 9 1 2 3 4 8 5 6 7 8 5 9 4 2 6 7 1 3 7 6 1 8 5 3 9 2 4 4 2 3 7 9 1 8 5 6  9 6 1 2 8 7 3 4 5 5 3 7 4 1 9 2 8 6 2 8 4 6 3 5 1 7 9 
}