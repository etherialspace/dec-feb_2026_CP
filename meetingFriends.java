// 30 20 10
import java.util.Scanner;
public class meetingFriends
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int min=input.nextInt();
		int mid=input.nextInt();
		int max=input.nextInt();
		for(int i=0;i<2;i++)
	{	if(min>mid)
		{
			int temp=min;
			min=mid;
			mid=temp;
		}
		if(mid>max)
		{
			int temp=mid;
			mid=max;
			max=temp;
		}
	}
	int c=mid-min;
	c=c+max-mid;
	System.out.print(c);
	}

}