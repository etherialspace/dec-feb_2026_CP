import java.util.Scanner;
public class electricity
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Type units");
		double units=input.nextInt();

		double sum=0;;
		if(units<=50)
		{
			sum=sum+units*0.50;
		}
		else if(units <=150)
		{
			sum=sum+50*0.50+(units-50)*0.75;
		}
		else if (units <=250)
		{
			sum=sum+50*0.50+100*0.75+(units-150)*1.20;
		}
		else 
		{
			sum=sum+50*0.50+100*0.75+250*1.20+(units-250)*1.50;
		}
		sum=sum+0.20*sum;
		System.out.println("Total Electricity Bill ="+sum);
	}
}