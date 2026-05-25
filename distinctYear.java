import java.util.Scanner;
public class distinctYear
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int givenYear=input.nextInt();
		int[] arr=new int[4];
		givenYear++;
		int year=givenYear;
		for(int i=0;i<4;i++)
		{
			arr[3-i]=year%10;
			year/=10;
		}
		//arr done
		int count=0;
		int i=0;int j=0;
		
		while(i<3)	
		{
			while(j<4)
			{
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+i+" "+j);
				if(arr[i]==arr[j])
				{		
					i=0;
					j=0;					
					count=0;
					givenYear++;
					year=givenYear;
					for(int m=0;m<4;m++)
					{
						arr[3-m]=year%10;
						year/=10;
					}
					
				}
				else
				{
					j++;
				}

			}
			i++;
		}

		for(i=0;i<4;i++)
		{
			System.out.print(arr[i]);
		}
	}
}