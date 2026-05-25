import java.util.Scanner;
public class area_of_triangle
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double[][][] points_arr=new double[3][2][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter "+i+" coordinates");
				points_arr[i][1][j]=input.nextDouble();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("arr["+i+"]"+"[1]["+j+"] : "+points_arr[i][1][j]);
			}
		}
		double side1=Math.pow(Math.pow(points_arr[1][1][0]-points_arr[0][1][0],2)+Math.pow(points_arr[1][1][1]-points_arr[0][1][1],2),0.5);
		double side2=Math.pow(Math.pow(points_arr[2][1][0]-points_arr[1][1][0],2)+Math.pow(points_arr[2][1][1]-points_arr[1][1][1],2),0.5);
		double side3=Math.pow(Math.pow(points_arr[2][1][0]-points_arr[0][1][0],2)+Math.pow(points_arr[2][1][1]-points_arr[0][1][1],2),0.5);
		
		double side=(side1+side2+side3)/2;

		double area= Math.pow(side*(side-side1)*(side-side2)*(side-side3),0.5);
		if(area!=Double.NaN)
		{
			System.out.println("The three points are on the same line");
		}else {
			System.out.println("The area is "+area);
		}
		
	}
}