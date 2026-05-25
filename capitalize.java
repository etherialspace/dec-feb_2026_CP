import java.util.Scanner;
public class capitalize
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s =input.next();
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				char c=s.charAt(i);
				if(Character.isLowerCase(c))
				{
					System.out.print(Character.toUpperCase(c));
				}
				else
				{
					System.out.print(s.charAt(i));
				}
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}