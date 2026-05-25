public class arr
{
	public static void main(String[] args)
	{	
		char[] arr=new char[100];
		int arr_size=arr.length;
		arr=create_array(arr,arr_size);
		display_arr(arr,arr.length);
		arr_occur(arr,arr.length);
	}
	public static char[] create_array(char[] arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			int random_num=(int)(Math.random()*26);
			char random_char_lc=(char)('a'+random_num);
			arr[i]=random_char_lc;
		}
		return arr;
	}

	public static void display_arr(char[] arr,int size)
	{	
		System.out.println("The lowercase letters are: ");
		int line_length=1;
		for(int i=0;i<size;i++)
		{
			if(line_length++ %20==0)
			{
				System.out.println(arr[i]+" ");
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void arr_occur(char[] arr,int size)
	{
		System.out.println();
		System.out.println("The occurences of each letter are:");
		int[] arr1=new int[26];

		for(int i=0;i<size;i++)
		{
			int aci=(int)(arr[i]);//76
			arr1[aci-(int)('a')]++;
		}
		int line_length=0;
		for(int i=0;i<26;i++)
		{	
			line_length++;
			if(line_length%10==0)
			{
				System.out.println(arr1[i]+" "+(char)('a'+i)+" ");
			}
			else
			{
				System.out.print(arr1[i]+" "+(char)('a'+i)+" ");
			}			
		}
	}
}