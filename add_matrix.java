import java.util.Scanner;
public class add_matrix
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Type matrix size");
		int size=input.nextInt();
		
		double[][] m1=new double[size][size];
		double[][] m2=new double[size][size];
		double[][] m3=new double[size][size];

		System.out.println("Enter matrix1");
		
		m1=input_2d_arr(m1,size,input);
		System.out.println("Enter matrix2");
		m2=input_2d_arr(m2,size,input);
		System.out.println("The multiplication of the matrices is ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				m3[i][j]=(m1[i][0]*m2[0][j])+(m1[i][1]*m2[1][j])+(m1[i][2]*m2[2][j]);
			}
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(m1[i][j]+" ");
			}
			
			if(i==1)
			{
				System.out.print("  *  ");
			}
			else
			{
				System.out.print("     ");
			}
			for(int k=0;k<size;k++)
			{
				System.out.print(m2[i][k]+" ");
			}

			if(i==1)
			{
				System.out.print("  =  ");
			}
			else
			{
				System.out.print("     ");
			}
			for(int l=0;l<size;l++)
			{
				System.out.print(String.format("%.2f",m3[i][l])+" ");
			}
			System.out.println();
		}

	}
	public static double[][] input_2d_arr(double[][] arr,int size,Scanner input)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=input.nextDouble();
			}
		}
		return arr;
	}
}