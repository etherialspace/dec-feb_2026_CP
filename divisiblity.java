import java.util.Scanner;
import java.math.BigInteger;
public class divisiblity
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		long n=input.nextLong();
		for(long i=0;i<n;i++)
		{
			long a=input.nextLong();
			long b=input.nextLong();
			
			long m=0;
			while((a+m)%b!=0)
			{
				m++;
			}
			System.out.println(m);
		}
	}
}
// 5
// 10 4
// 13 9
// 100 13
// 123 456
// 92 46

// 2
// 5
// 4
// 333
// 0

