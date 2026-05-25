import java.util.Scanner;
import java.math.BigInteger;
// #do it with String only
public class contest
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		String a=input.next();
		int alen=a.length();
		String b=input.next();
		int blen=b.length();
		for(int i=0;i<alen;i++)
		{
			if(a.charAt(i)==(b.charAt(i)))
			{
				System.out.print(0);
			}
			else
			{
				System.out.print(1);
			}
		}
		// BigInteger b=BigInteger.parseBigInteger(a);
	
		// BigInteger b=input.nextBigInteger();
		// int alen=a.toString().length();
		// System.out.println("len="+alen);
		
		// int[] arr=new int[alen];
		
		
		// for(int i=0;i<alen;i++)
		// {
		// 	System.out.println("Executing");
		// 	BigInteger c=a.remainder(BigInteger.valueOf(10));
		// 	BigInteger d=b.remainder(BigInteger.valueOf(10));
		// 	if(c.equals(d))
		// 	{
		// 		arr[alen-i-1]=0;
		// 	}
		// 	else
		// 	{
		// 		arr[alen-i-1]=1;
		// 	}
		// 	a=a.divide(BigInteger.valueOf(10));
		// 	b=b.divide(BigInteger.valueOf(10));
		// }
		
		// System.out.println("len="+alen);
		// for(int i=0;i<alen;i++)
		// {
		// 	// System.out.print(arr[i]);
		// }
		
	}
}