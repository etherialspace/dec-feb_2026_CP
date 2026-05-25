import java.util.Scanner;
public class guess_capitals
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String[][] state_capital=
		{
	{"alabama", "montgomery"},
	{"alaska", "juneau"},
	{"arizona", "phoenix"},
	{"arkansas", "little_rock"},
	{"california", "sacramento"},
	{"colorado", "denver"},
	{"connecticut", "hartford"},
	{"delaware", "dover"},
	{"florida", "tallahassee"},
	{"georgia", "atlanta"},
	{"hawaii", "honolulu"},
	{"idaho", "boise"},
	{"illinois", "springfield"},
	{"indiana", "indianapolis"},
	{"iowa", "des_moines"},
	{"kansas", "topeka"},
	{"kentucky", "frankfort"},
	{"louisiana", "baton_rouge"},
	{"maine", "augusta"},
	{"maryland", "annapolis"},
	{"massachusetts", "boston"},
	{"michigan", "lansing"},
	{"minnesota", "saint_paul"},
	{"mississippi", "jackson"},
	{"missouri", "jefferson_city"},
	{"montana", "helena"},
	{"nebraska", "lincoln"},
	{"nevada", "carson_city"},
	{"new_hampshire", "concord"},
	{"new_jersey", "trenton"},
	{"new_mexico", "santa_fe"},
	{"new_york", "albany"},
	{"north_carolina", "raleigh"},
	{"north_dakota", "bismarck"},
	{"ohio", "columbus"},
	{"oklahoma", "oklahoma_city"},
	{"oregon", "salem"},
	{"pennsylvania", "harrisburg"},
	{"rhode_island", "providence"},
	{"south_carolina", "columbia"},
	{"south_dakota", "pierre"},
	{"tennessee", "nashville"},
	{"texas", "austin"},
	{"utah", "salt_lake_city"},
	{"vermont", "montpelier"},
	{"virginia", "richmond"},
	{"washington", "olympia"},
	{"west_virginia", "charleston"},
	{"wisconsin", "madison"},
	{"wyoming", "cheyenne"}
};
	int right_guess=0;
	for(int i=0;i<50;i++)
	{
		System.out.println("Type the capital of "+state_capital[i][0]);
		String guess=input.next();
		
		if(state_capital[i][1].equals(guess))
		{	
			right_guess++;
			System.out.println("Right Ans.");	
		}
		else
		{
			System.out.println("The right answer is"+state_capital[i][1]);
		}
	}
	System.out.println("You guessed :"+right_guess);
	}
}