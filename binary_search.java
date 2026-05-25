public class binary_search
{
	public static void main(String[] args)
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Type the size of array");
		int size=input.nextInt();
		int[] arr=new int[size];
		arr=input_array(arr,size,input);
		display_arr(arr,size);
		System.out.println("Enter the element you want to search");
		int find_elem=input.nextInt();
		int find_state=binary_search_(arr,0,size-1,find_elem);
		if(find_state==-1)
		{
			System.out.println("Element not found!");
		}
		else {
			System.out.println("Element found at index ="+find_state);
		}
	}
	public static int[] input_array(int[] arr,int size,java.util.Scanner input)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print("a["+i+"] =");
			arr[i]=input.nextInt();
			
		}
		return arr;
	}
	public static void display_arr(int[] arr,int size)
	{
		System.out.println("Displaying array");
		for(int i=0;i<size;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
	public static int binary_search_(int[] arr,int low,int high,int find_elem)
	{
		while(high>=low)
		{
			int mid=(high-low)/2;
			if(find_elem==arr[mid])
			{
				return mid;
			}
			else if(find_elem>arr[mid])
			{
				low=mid+1;
				return binary_search_(arr,low,high,find_elem);
			}
			else if(find_elem<arr[mid])
			{
				high=mid-1;
				return binary_search_(arr,low,high,find_elem);
			}else
			{
				return -1;
			}
		}
		return -1;
	}
}