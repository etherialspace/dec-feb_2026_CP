import java.util.Scanner;
public class latin_square
{
	public static void main(String[] args)
	{
		System.out.println("Enter number :");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("Enter "+n+" rows of letters separated by spaces:");
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=input.next().charAt(0);
			}
		}
		int[] arr_char=new int[n];
		arr_char[0]=65;
		for(int i=1;i<n;i++)
		{
			arr_char[i]=arr_char[i-1]++;
		}
		int m=65;
		boolean state=true;
		boolean final_state=true;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int element:arr_char)
				{		
					if(arr[i][j]!=element)
					{
						state=true;
						System.out.print(state);
					}
				}
				if(state!=true)
				{
					System.out.println("Wrong input: the letters must be from A to C");
					state=false;
					final_state=false;
					
					
				}
			}
		}
		if(state!=false)
		{	
			System.out.println("The input array is a latin square");	
		}	
	}	
}
