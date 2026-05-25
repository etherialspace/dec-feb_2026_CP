import java.util.Scanner;
public class digit_combinations
{
	public static void main(String[] args)
	{
		int a=2349;
		char[] digits=String.valueOf(a).toCharArray();
		char[] digits1=String.valueOf((int)(a/10)).toCharArray();
		char[] digits2=String.valueOf((int)(a/100)).toCharArray();
		char[] digits3=String.valueOf((int)(a/1000)).toCharArray();
		// for(char b:digits)
		// {
		// 	for(char c:digits1)
		// 	{
		// 		for(char d:digits2)
		// 		{
		// 			for(char e:digits3)
		// 			{
		// 				System.out.print(b+c+d+e);
		// 			}
		// 			System.out.println();
		// 		}
		// 	}
		// }
		for(char b:digits)
		{	
			for( char c:digits1)
			{
				System.out.println(b+c);
			}
		}
		// for(char b:digits1)
		// {
		// 	System.out.println("digits 1:"+b);
		// }
		// for(char b:digits2)
		// {
		// 	System.out.println("digits 2:"+b);
		// }
		// for(char b:digits3)
		// {
		// 	System.out.println("digits 3:"+b);
		// }
		
		
	}
}