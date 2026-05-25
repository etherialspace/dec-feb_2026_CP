import java.util.Scanner;
public class pangram
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String s=input.next();
		int count=0;
		char a='a';
		s=s.toLowerCase();
		for(int i=1;i<=26;i++)
		{
			for(int m=0;m<n;m++)
			{
				if(s.charAt(m)==a)
				{
					count++;
					break;
				}
			}
			a++;	
		}
		
		if(count>=26)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
// all 26 letter in this 
// 35
// TheQuickBrownFoxJumpsOverTheLazyDog
// yes