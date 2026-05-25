import java.util.Scanner;
public class problem
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		boolean hardness=false;
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
			if(arr[i]==1)
			{
				hardness=true;
			}
		}
		if(hardness)
		{
			System.out.println("HARD");
		}
		else
		{
			System.out.println("EASY");
		}
	}
}
// 3
// 0 0 1
// HARD