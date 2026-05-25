public class hexagon
{
	public static void main(String[] args)
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Type number of repetitions");
		int rep=input.nextInt();
		hexa(rep);
	}
	public static void hexa(int rep)
	{	
		for(int i=0;i<rep;i++)
		{
			for(int j=0;j<rep-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<=rep;l++)
			{
				System.out.print("*");
			}
			for(int m=0;m<=i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<rep;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=rep-i;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<=rep;l++)
			{
				System.out.print("*");
			}
			for(int m=0;m<=rep-i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}