import java.util.Scanner;
public class left_right_on
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Type 3 Points p0,p1,p2");

		double x1=input.nextDouble();
		double x2= input.nextDouble();

		double y1=input.nextDouble();
		double y2=input.nextDouble();

		double z1=input.nextDouble();
		double z2=input.nextDouble();

		boolean left=left_of_line(x1,x2,y1,y2,z1,z2);
		boolean right=right_of_line(x1,x2,y1,y2,z1,z2);
		boolean on_line=on_line_segment(x1,x2,y1,y2,z1,z2);

		if(left==True)
		{
			System.out.println("("+z1+","+z2+")"+" is on the left side of the line from "
				+"("+x1+","+x2+")"
				+"("+y1+","+y2+")");
		}
		else if(right==True)
		{
			System.out.println("("+z1+","+z2+")"+" is on the right side of the line from "
				+"("+x1+","+x2+")"
				+"("+y1+","+y2+")");
		}
		else if (on_line==True)
		{
			System.out.println("("+z1+","+z2+")"+" is on the line segment of the line from "
				+"("+x1+","+x2+")"
				+"("+y1+","+y2+")");
		}
		else
		{
			System.out.println("("+z1+","+z2+")"+" is on the same line from "
				+"("+x1+","+x2+")"
				+"("+y1+","+y2+")");
		}
	}
	public static boolean left_of_line(double x1,double x1,double y1, double y2,double z1 , double z2)
	{
		if(z1>x1)||(z1>y1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean right_of_line(double x1,double x1,double y1, double y2,double z1 , double z2)
	{
		if(z2>x2)||(z2>y2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean on_line_segment(double x1,double x1,double y1, double y2,double z1 , double z2)
	{
		if((x1<z1)&&(z1<y1))||((x2<z2)&&(z2<y2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}