import java.util.Scanner;
public class watermelon
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		//n=8
		int c=0;
		for(int i=1;i<n;i++)
		{
			if(i%2==0&&(n-i)%2==0)
			{
				// System.out.println(i+" "+(n-i));
				c=1;
				
			}
		}
		if(c==0)
		{
			System.out.printf("NO");
		}
		else
		{
			System.out.printf("YES");
		}

	}
}