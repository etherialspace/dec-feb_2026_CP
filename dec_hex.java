// decimal to headecimal number 


import java.util.Scanner;
public class dec_hex
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int dec=input.nextInt();
		int dec1=dec;
		String hex="";

		while(dec!=0)
		{
			int rem=dec%16;
			if(rem>9)
			{
				char a=(char)((int)'A'+(rem-10));
				hex=hex+a;
			}
			else
			{
				hex=hex+rem;
			}
			
			dec=dec/16;
		}
		System.out.println(hex); 
	}
}