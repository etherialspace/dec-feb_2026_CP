import java.util.Scanner;
public class func
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		BigInteger n=input.nextBigInteger();
		if(n%2==0)
		{
			//even
			n=n*(n+2)/4;
		}
		else
		{
			//odd
			n=(n+1)*(n+1)/4;
		}
		System.out.println(n);
	}
}
