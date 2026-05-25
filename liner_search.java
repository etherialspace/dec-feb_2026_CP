public class liner_search
{
	public static void main(String[] args)
	{
		int[] myList={1,3,4,5,6,7,8,9};
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Elements in the array are of int type");
		for(int e:myList)
		{
			System.out.println(e);
		}
		System.out.println("Enter element to find");
		int find=input.nextInt();
		boolean find_state=false;
		for(int e:myList)
		{
			if(find==e)
			{
			System.out.println("Element found!");
			find_state=true;
			}
		}
		if(find_state==false)
		{
			System.out.println("Element not found");
		}
		
		
	}
}