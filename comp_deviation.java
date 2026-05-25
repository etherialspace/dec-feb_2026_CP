import java.util.Scanner;
public class comp_deviation
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);


		System.out.println("Type n");
		int n=input.nextInt();

		double[] arr=new double[n];
		arr=input_array(arr,input);
		double mean_arr=mean(arr);
		double deviation_arr=deviation(arr,mean_arr);
		System.out.println("The mean is "+mean_arr);
		System.out.println("The standard deviation is "+deviation_arr);
	}
	public static double[] input_array(double[] arr,Scanner input)
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			System.out.print("a["+i+"]:");
			arr[i]=input.nextDouble();
		}
		return arr;
	}
	public static double deviation(double[] x,double mean_arr)
	{
		int size=x.length;
		double sum=0.0;
		for(int i=0;i<size;i++)
		{
			sum=sum+Math.pow((x[i]-mean_arr),2);
		}
		sum=sum/(size-1);
		sum=Math.pow(sum,0.5);
		return sum;
	}
	public static double mean(double[] x)
	{
		int size=x.length;
		double sum=0.0;
		for(int i=0;i<size;i++)
		{
			sum+=x[i];
		}
		sum=sum/size;
		return sum;
	}

}