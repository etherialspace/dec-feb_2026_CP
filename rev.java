import java.util.Scanner;
public class rev
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		String t=input.next();
		int len=s.length();
		int count=0;
		if(s.length()==t.length())
		{
			for(int i=0;i<len;i++)
			{
				if(s.charAt(i)==t.charAt(len-i-1))
				{
					count++;
				}
			}
			if(count==len)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		else
		{
			System.out.println("NO");
		}
		
	}	
}

// code
// edoc
