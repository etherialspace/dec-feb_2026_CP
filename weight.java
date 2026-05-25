import java.util.Scanner;
public class weight
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a =input.nextInt();
		int b=input.nextInt();
		for(int i=1;i<100;i++)
		{
			a=3*a;
			b=2*b;
			if(a>b)
			{
				System.out.println(i);
				break;
			}
		}
	}
}