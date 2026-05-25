import java.util.Scanner;
public class new
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		BigInteger a=input.nextBigInteger();
		BigInteger b=input.nextBigInteger();

		BigInteger m=input.nextBigInteger();
		boolean d=!(a.add(m)).remainder(b).equals(0);
	}
}