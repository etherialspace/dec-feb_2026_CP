import java.util.Scanner;
public class bit
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num=0;
		for(int i=0;i<n;i++)
		{
			String s=input.next();
			if(s.charAt(0)=='+' || s.charAt(1)=='+')
			{
				//increament
				num++;
			}
			else
			{
				//decreament
				num--;
			}
		}
		System.out.println(num);
	}
}
// 2
// X++
// --X
