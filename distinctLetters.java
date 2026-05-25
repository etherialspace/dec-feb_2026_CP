import java.util.Scanner;
public class distinctLetters
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		int len=s.length();
		int count=0;
		int c=0;int index=0;
		char[] arr=new char[26];
		for(int i=0;i<len;i++)
		{
			
			if(Character.isLetter(s.charAt(i)))
			{
				
				for(int m=0;m<index;m++)
				{
					if(arr[m]==s.charAt(i))
					{
						c=1;
						
					}
				}
				if(c==0)
				{	
					count++;
					arr[index++]=s.charAt(i);
				}
				else
				{
					c=0;
				}
				
			}	
		}
		
		System.out.println(count);
	}
}
//{a, b, c}
