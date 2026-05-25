import java.util.Scanner;
public class format_int
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int num=input.nextInt();
		System.out.println("Enter width");
		int width=input.nextInt();
		String num_out=format(num,width);
		System.out.println(num_out);
	}
	public static String format(int number,int width)
	{
		int length=find_int_length(number);
		String num1="";
		if(length<width)
		{
			while((width-length)!=0)
			{
				num1=num1+"0";
				width--;
			}
			num1=num1+number;
			return num1;
		}
		else
		{	
			num1=number+"";
			return num1;
		}
	}
	public static int find_int_length(int number)
	{
		int length=0;
		while(number !=0)
		{
			number=number/10;
			length++;
		}
		return length;
	}
}