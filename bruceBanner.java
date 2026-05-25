import java.util.Scanner;
public class bruceBanner
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				//even
				if(i==n)
				{
					System.out.print("I love it");
				}
				else
				{
					System.out.print("I love that ");
				}
			}
			else
			{
				//odd
				if(i==n)
				{
					System.out.print("I hate it");
				}
				else
				{
					System.out.print("I hate that ");
				}
			}
		}
	}
}
// 3
// I hate that I love that I hate it
