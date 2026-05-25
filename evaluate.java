public class evaluate
{
	public static void main(String[] args)
	{
		int y=18;
		y++ = ++y + y-- + --y;
		System.out.println(y);
		y=18;
		--y=--y - --y - y--;
		System.out.println(y);

		y=18;
		y*=y+5;
		System.out.println(y);

		y=18;
		y=y%2 + ++y - --y;
		System.out.println(y);
	}
}