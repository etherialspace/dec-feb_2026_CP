import java.util.Scanner;
import java.math.BigInteger;
public class func1
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		BigInteger n=input.nextBigInteger();
		BigInteger i=BigInteger.valueOf(1);
		BigInteger sum=BigInteger.valueOf(0);
		while(!i.equals(n))
		{
			if(i.remainder(BigInteger.valueOf(2))==BigInteger.valueOf(0))
			{
				//even
				sum=sum.add(i);
			}	
			else
			{
				//odd
				sum=sum.subtract(i);
			}
			i=i.add(BigInteger.valueOf(1));
		}
		System.out.println(sum);
	}
}
