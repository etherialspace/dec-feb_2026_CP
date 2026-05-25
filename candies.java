import java.util.Scanner;
public class candies
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			int a=input.nextInt();
			
			for(int m=1;m<a;m++)
			{
				if(m<(a-m))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.println(count);
			count=0;
		}
	}
}

