import java.util.Scanner;
public class casing
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		int len=s.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				count++;
				
			}
		}
		if(len-count>=count)
		{
			//lowercase
			for(int i=0;i<len;i++)
			{
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}		
		}
		else
		{
			//uppperCase
			for(int i=0;i<len;i++)
			{
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}
		}
	}
}
// HoUse
