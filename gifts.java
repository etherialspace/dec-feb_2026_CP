import java.util.Scanner;
public class gifts
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int m=1;m<=n;m++)
		{
			for(int i=0;i<n;i++)
			{
				if(arr[i]==m)
				{
					System.out.print((i+1)+" ");
				}				
			}

		}
	}
}