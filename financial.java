import java.util.Scanner;

public class financial
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the subtotal and a gratuity rate: ");

		int subtotal=input.nextInt();
		int gratuity=input.nextInt();

		float gratuity_1=(float)subtotal*gratuity/100;

		float total=(float)subtotal+gratuity_1;

		System.out.println("The gratuity is $"+gratuity_1 + " and total is $"+total );
	}
}