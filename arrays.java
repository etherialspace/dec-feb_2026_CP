public class arrays
{
	public static void main(String[] args)
	{
		int[] arr={2,6,4,9,8,6,3,9};
		int[] arr1={2,6,4,9,8,6,3,9};
		java.util.Arrays.parallelSort(arr);
		boolean out=java.util.Arrays.equals(arr,arr1);
		System.out.println("Are both arrays equal :"+out);
		display(arr);
		int find1=java.util.Arrays.binarySearch(arr,9);
		System.out.println("java.util.Arrays.binarySearch  at index"+find1);
		// java.util.Arrays.fill(arr,8,9,10);
		String str=java.util.Arrays.toString(arr);
		System.out.println(str);
		display(arr);
	}
	public static void display(int[] arr)
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}