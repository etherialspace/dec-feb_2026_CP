import java.util.Scanner;
public class patterns
{
	public static void main(String[] args)
	{	
		System.out.println("Enter the number of repeatitions");
		Scanner input=new Scanner(System.in);
		int rep=input.nextInt();
		System.out.println("Type the special character you  want to print");
		String a=input.next();
		int len=a.length();
		while(len!=1)
		{
			System.out.println("Type on 1 special character");
			a=input.next();
			len=a.length();
		}
		inverted_L_traingle(rep,a);
		// triangle_pattern(10,'*');
		// inverted_triangle(10,'*');
	}
	public static void triangle_pattern(int lines,char symbol)
	{
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
	public static void inverted_triangle(int lines,char symbol)
	{
		for(int i=0;i<lines;i++)
		{
			for(int j=lines-i;j>0;j--)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
	public static void inverted_L_traingle(int lines,String symbol)
	{
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<lines-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<=i;m++)
			{
				System.out.print(symbol);
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(symbol);
			}
			// if(i!=lines-1)
			// {
			// 	System.out.println();
			// }
			System.out.println();
		}
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<lines-i-1;m++)
			{
				System.out.print(symbol);
			}
			for(int k=0;k<lines-i;k++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}

	}
}