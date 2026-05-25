import java.util.Scanner;
public class analyzeNumbers
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of items");
		int size=input.nextInt();
		double[] arr=new double[size];
		arr=input_arr(input,arr,size);
		display_arr(arr,size);
		double avg=average_arr(arr,size);
		System.out.println("Average is "+avg);
		int elements=elem_above_average(arr,size,avg);
		System.out.println("Elements above average are :"+elements);

	}
	public static double[] input_arr(Scanner input,double[] arr,int size)
	{
		System.out.println("Enter the number ");
		
		for(int i=0;i<size;i++)
		{
			System.out.print("arr["+i+"]=");
			arr[i]=input.nextDouble();
		}
		return arr;
	}
	public static void display_arr(double[] arr,int size)
	{	
		System.out.println("Displaying array: ");
		for(int i=0;i<size;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);

		}
	}
	public static double average_arr(double[] arr,int size)
	{
		double sum=0.0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		return (sum/size);
	}
	public static int elem_above_average(double[] arr,int size,double average)
	{
		int elements=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>average)
			{
				elements++;
			}
		}
		return elements;
	}
}