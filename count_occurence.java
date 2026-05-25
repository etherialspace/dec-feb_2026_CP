import java.util.Scanner;
public class count_occurence
{
	public static void main(String[] args)
	{	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 50");
		System.out.println("Type size");
		int size=input.nextInt();
		int[] arr=new int[size];
		arr=input(arr,size,input);
		java.util.Arrays.sort(arr);
		for(int i=0;i<size;i++)
		{	
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
				}
			}
			System.out.println(arr[i]+" occurs"+count+" times");
			i++;
		}		
	}
	public static void display(int[] arr)
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	} 
	public static int[] input(int[] arr,int size,Scanner input)
	{
		for(int i=0;i<size;i++)
		{
			System.out.println("arr["+i+"] =");
			arr[i]=input.nextInt();
		}
		return arr;
	}

}