
public class bubble_sort
{
	public static void main(String[] args)
	{
		double arr[]={3.9,8.9,9.9,6.7,9.9,3.4,4.5,2.3,4.5};
		int length=arr.length;
		//bubble sort
		arr=bubble_sort_algo(arr);
		System.out.println("After Sorting!");
		int size=arr.length;

		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static double[] bubble_sort_algo(double[] arr)
	{
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					double temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}