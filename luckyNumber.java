import java.util.Scanner;
public class luckyNumber
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		long a=input.nextLong();
		long a_copy=a;
		int count=0;
		while(a!=0)
		{
			long rem=a%10;
			a=a/10;
			if(rem==4||rem==7)
			{
				count++;
			}
		}

		if(count==4||count==7)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}