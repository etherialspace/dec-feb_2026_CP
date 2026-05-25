public class consecutive
{
	public static void main(String[] args)
	{
		java.util.Scanner input=new java.util.Scanner(System.in);

		int size=input.nextInt();
		int[] arr=new int[size];
		int prev=0;
		int count=0;
		for (int i=0; i<size; i++) {
			arr[i]=input.nextInt();
		}
		for(int j=0;j<size;j++){
			if((j+4<=size)&&(((arr[j]==arr[j+1])&&(arr[j+1]==arr[j+2]))&&(arr[j+2]==arr[j+3])))
			{
				System.out.println("Consecutive 4's present");
			}	
		}

	}
}