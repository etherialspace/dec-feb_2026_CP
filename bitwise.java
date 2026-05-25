public class bitwise
{
	public static void main(String[] args)
	{
		int i=4;
		if(i==4 & ++i !=5)
		{
			System.out.println("Bitwise True i="+i);
		}
		else
		{
			System.out.println("Bitwise False");
		}
		i=4;
		if(i==4 && ++i!=5)
		{
			System.out.println("Logical and True i= "+i);
		}
		else`
		{
			System.out.println("Logical and False i= "+i);
		}
	}
}