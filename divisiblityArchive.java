import java.util.Scanner;
import java.math.BigInteger;
public class divisiblity
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			BigInteger a=input.nextBigInteger();
			BigInteger b=input.nextBigInteger();
			
			BigInteger m=BigInteger.valueOf(0);
			boolean c=true;
			while(c==true)
			{
				if((a.add(m)).remainder(b).equals(BigInteger.valueOf(0))==true)
				{
					c=false;
				}
				System.out.println((a.add(m)).remainder(b));
				m.add(BigInteger.valueOf(1));
			}
			System.out.println(m);
		}
	}
}