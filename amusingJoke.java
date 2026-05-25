// SANTACLAUS
// DEDMOROZ
// SANTAMOROZDEDCLAUS

import java.util.Scanner;
public class amusingJoke
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a=input.next();
		String b=input.next();
		String c=input.next();
		int[] arr=new int[26];
		char ch='A';
		
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<a.length();j++)
			{
				if(ch==a.charAt(j))
				{
					arr[i]++;
				}
			}
			for(int j=0;j<b.length();j++)
			{
				if(ch==b.charAt(j))
				{
					arr[i]++;
				}
			}
			int count=0;
			for(int j=0;j<c.length();j++)
			{
				if(ch==c.charAt(j))
				{
					count++;
				}
			}
			if(count!=arr[i])
			{
				System.out.print("NO");
				return;
			}
			ch++;
		}
		System.out.print("YES");
	}
}