public class pattern
{
	public static void main(String[] args)
	{
		number_of_days(2014,2034);
	}	

	public static void number_of_days(int year1,int year2)
	{
		int num_of_years=year2-year1+1;
		int num_of_days=num_of_years*365+(int)(num_of_years/4);
		System.out.println(num_of_days);
	}
	
}
