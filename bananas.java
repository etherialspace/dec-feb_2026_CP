import java.util.Scanner;
public class bananas
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int firstCost=input.nextInt();
		int dollars=input.nextInt();
		int bananasWant=input.nextInt();
		int cost=0;
		for(int i=1;i<=bananasWant;i++)
		{
			cost+=i*firstCost;
		}
		if(cost>dollars)
		{
			System.out.println(cost-dollars);	
		}else
		{
			System.out.println(0);
		}
	}
}
//3 17 4
