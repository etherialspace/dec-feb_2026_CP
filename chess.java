import java.util.Scanner;
public class chess
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int len=input.nextInt();
		String s=input.next();int counta=0;int countb=0;
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='A')
			{
				counta++;
			}
			else
			{
				countb++;
			}
		}
		if(counta>countb)
		{
			System.out.println("Anton");
		}
		else if(counta<countb)
		{
			System.out.println("Danik");
		}
		else
		{
			System.out.println("Friendship");
		}
	}
} 

// 6
// ADAAAA
