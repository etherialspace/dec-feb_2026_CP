import java.util.Scanner;

public class volume
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.print("Enter the length of the sides and hieght of equilateral triangle");
		float side=input.nextFloat();

		float area=(float)Math.sqrt(3)/4*side*side;

		System.out.println("The area is "+ area);

		float volume=area*side;

		System.out.println("The Volume of the Triangular prism is "+volume);
	}
}