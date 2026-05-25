public class binary_search1
{
	public static void main(String[]args)
	{
		int[] arr={10,20,30,40,50,60,70,80,90};
		int a=10;
		int index=search(a,arr);
		if(index==-1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Element found at "+index);
		}

	}
	public static int search (int find,int[] arr)
	{
		int low=0;
		int high=arr.length;
		while(high>=low)
		{
			int mid=low+(high-low)/2;
			if(find<arr[mid])
			{
				high=mid-1;
			}
			else if(find==arr[mid])
			{
				return mid;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}
}