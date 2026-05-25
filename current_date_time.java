public class current_date_time
{
	public static void main(String[] args)
	{
		double millis=System.currentTimeMillis();

		double seconds=millis/1000;
		int current_second=(int)(seconds%60);
		double minutes=seconds/60;
		int current_minute=(int)(minutes%60);
		double hours=minutes/60;
		double num_of_days=hours/24;
		double num_of_years=num_of_days/365;
		int current_year=(int)(num_of_years)+1970;

		
		int current_hour=(int)(hours%24);
		System.out.println("Current date and time is "
			+current_year+" "
			+current_hour+":"+current_minute+":"+current_second);
	}
}