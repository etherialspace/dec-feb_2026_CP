import java.util.Scanner;
public class fence
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int height=input.nextInt();
		int[] arr=new int[n];
		int width=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
			if(arr[i]<=height)
			{
				width++;
			}
			else
			{
				width+=2;
			}
		}
		System.out.println(width);
	}
}