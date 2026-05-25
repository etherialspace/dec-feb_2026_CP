public class emrip
{
	public static void main(String[] args)
	{
		int i=0;
		long m=2;
		int line_num=1;
		Boolean check_prime;
		Boolean check_non_palindrome;
		
		while(i!=120)
		{

			check_prime=prime(m);
			check_non_palindrome=non_palindrom(m);
			if(check_prime == true && check_non_palindrome==true)
			{
				if(line_num%10==0)
				{
					line_num++;
					System.out.println("  "+m);
					i++;

				}
				else
				{
					line_num++;
					System.out.print("  "+m);
					i++;
				}
			}
			
			m++;
			
		}
	}

	public static Boolean non_palindrom(long num)
	{	
		long sum=0;
		long rem=0;
		long num_copy=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;

		}
		if(num_copy ==sum)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static Boolean prime(long num)
	{
		Boolean state=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				state=false;
			}
		}
		return state;
	}  
}