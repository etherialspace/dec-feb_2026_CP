import java.util.Scanner;
public class a1
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			String s=input.next();
			int size=s.length();
			boolean ans=false;
			for(int j=size-1;j>0;j-=2)
			{
				if(s.charAt(j)=='Y'&&s.charAt(j-1)=='Y')
				{
					//No
					if(ans ==true)
					{
						ans=true;
					}
					else
					{
						ans=false;
					}
				}
				else if(s.charAt(j)=='Y'&&s.charAt(j-1)=='N')
				{
					//Yes
					if(ans ==true)
					{
						ans=true;
					}
					else
					{
						ans=true;
					}
				}
				else if(s.charAt(j)=='N'&&s.charAt(j-1)=='Y')
				{
					//Yes
					if(ans ==true)
					{
						ans=true;
					}
					else
					{
						ans=true;
					}
				}
				else
				{
					//n n case 
					//output:yes or no
					if(ans ==true)
					{
						ans=true;
					}
					else
					{
						ans=true;
					}

				}

			}
			if(ans==false)
			{
				System.out.println("NO");
			}
			else 
			{
				System.out.println("YES");
			}
			

		}

	}
}