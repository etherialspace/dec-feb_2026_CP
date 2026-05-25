import java.util.Scanner;
public class magnet
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
// 6
// 10
// 10
// 10
// 01
// 10
// 10
