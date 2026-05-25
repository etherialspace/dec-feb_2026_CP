import java.util.Scanner;
public class elephantMoves
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num<6)
		{
			System.out.println(1);
		}
		else
		{
			int count=0;
			int num_cpy=num;
			for(int i=0;i<num_cpy;i++)
			{
				if(num>=5)
				{
					
					num=num-5;
					count++;
				}
				else if(num==4)
				{
					
					num=num-4;
					count++;
				}
				else if(num==3)
				{
					
					num=num-3;
					count++;
				}
				else if(num==2)
				{
					
					num=num-2;
					count++;
					
				}
				else if(num==1)
				{

					num=num-1;
					count++;
				}
				else
				{
					System.out.println(count);
					break;
				}

			}
		}
	}
}