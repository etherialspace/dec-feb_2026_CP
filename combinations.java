public class combinations
{
	public static void main(String[] args)
	{
		java.util.Scanner input =new java.util.Scanner(System.in);
		System.out.println("Enter num :");
		int num=input.nextInt();
		int_combination(num);
	}
	public static void int_combination(int num)
	{	
		String num1=""+num;
		int size=num1.length();
		int[] arr=new int[size];
		int i=size;
		while(num!=0)
		{
			int rem=num%10;
			arr[--i]=rem;
			num=num/10;
		}
		int[] arr1=combination_recursion(arr);
		// for(int j=0;j<arr1.length;j++)
		// {
		// 	System.out.println(arr1[j]);
		// }
	}
	public static combination_arr(int[] arr)
	{
		int arr_size=arr.length;
		int arr_list_size=1;
		for(int i=1;i<=arr_size;i++)
		{
			arr_list_size=arr_list_size*i;
		}
		int[] arr_list=new int[arr_list_size];

		for(int i=0;i<arr_list_size;i++)
		{
			
			int a=random_num(arr_size);

		} 
	}
	public static int random_num(int size)
	{
		
		return (int)(Math.random()*size);
	}
	// public static int[] combination_recursion(int[] arr)//main program
	// {
	// 	int size=arr.length;
	// 	//calculating size
	// 	int combination_size=1;
	// 	for(int i=1;i<=size;i++)
	// 	{
	// 		combination_size=combination_size*i;

	// 	}		
		
	// 	int[] arr1=new int[combination_size];
	// 	for(int i=0;i<size;i++)
	// 	{
	// 		System.out.print("Taking each element at last "+arr[size-i-1]);
	// 		int last=arr[i];
	// 		for(int j=0;j<size;j++)
	// 		{
	// 			if(arr[size-i-1]!=arr[j])
	// 			System.out.print("Fixing rotating first element "+arr[j]);
	// 			for(int k=0;k<size;k++)
	// 			{
	// 				if((arr[size-i-1]!=arr[k])||(arr[size-i-1]!=arr[j]))
	// 				{
	// 					System.out.println(arr[j]+arr[k]+arr[i]);
	// 				}
	// 			}
	// 		}
	// 		System.out.println();
	// 	}

		// for(int i=0;i<size;i++)
		// {
		// 	int last=arr[size-i-1];
		// 	for(int j=1;j<size;j++)
		// 	{
		// 		for(int k=2;k<size;k++)
		// 		{
		// 			int num=arr[i]*1000+arr[j]*100+arr[k]*10+last;
		// 			for(int l=0;l<arr1.length;l++)
		// 			{
		// 				if((arr1[l]!=num)&&(arr1[l]==0))
		// 				{
		// 					arr1[arr1[l]]=num;
		// 				}
		// 			}
		// 		}
		// 	}
		// }
		return arr1;
	}
}