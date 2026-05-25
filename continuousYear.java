import java.util.Scanner;
public class continuousYear
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for(int i=0;i<num;i++)
		{
			int len=input.nextInt();
			String s=input.next();
			int[] arr={'2','0','2','6'};
			int[] ans=new int[50];
			int count=0;int index=0;
			for(int j=0;j<len;j+=4)
			{
				if(s.charAt(j)=='2')
				{
					count++;
					if(s.charAt(j+1)=='0')
					{
						count++;
						if(s.charAt(j+2)=='2')
						{
							count++;
							if(s.charAt(j+3)=='6')
							{
								count++;
							}
						}
					}
				}

				arr[index++]=count;
				count=0;
			}
			java.util.Arrays.sort(arr);
			if(arr[0]!=0)
			{
				System.out.println(4-arr[0]);
			}
			else
			{
				System.out.println(arr[0]);
			}
			
			
		}	
	}
}
// 7
// 4
// 0000
// 4
// 2025
// 4
// 2026
// 8
// 20252026
// 8
// 20252025
// 9
// 202520256
// 9
// 202520265

// 0
// 1
// 0
// 0
// 1
// 1
// 0
