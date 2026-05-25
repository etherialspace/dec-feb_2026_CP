import java.util.Scanner;
public class drinks
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double n=input.nextDouble();
		double percent=100/n;
		double sum=0.00;
		for(int i=0;i<n;i++)
		{
			double a=input.nextDouble();
			sum=sum+percent*a/100;
		}
		System.out.println(sum);
	}
}
// 3
// 50 50 100
