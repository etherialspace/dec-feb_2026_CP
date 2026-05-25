import java.util.Scanner;
public class doChat
{
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			String s=input.next();
			char[] arr=new char[s.length()];int arrIndex=0;
			int present=0;
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<s.length();j++)
				{
					if(arr[j]==s.charAt(i))
					{
						present=1;
					}
				}
				if(present==1)
				{
					present=0;
				}
				else
				{
					arr[arrIndex++]=s.charAt(i);
				}
			}
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!='\u0000')
				{
					count++;
				}			}
			
			if(count%2==0)
			{
				System.out.println("CHAT WITH HER!");
			}else
			{
				System.out.println("IGNORE HIM!");
			}
	}
}

// wjmzbmr
// CHAT WITH HER!
// xiaodao
// IGNORE HIM!
