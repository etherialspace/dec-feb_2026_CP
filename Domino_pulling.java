import java.util.Scanner;
public class Domino_pulling
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		int d=m*n;
		System.out.println(d/2);
	}
}