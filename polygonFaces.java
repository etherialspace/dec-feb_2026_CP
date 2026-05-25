import java.util.Scanner;
public class polygonFaces
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count =0;
		for(int i=0;i<n;i++)
		{
			String s=input.next();
		
			if(s.equals("Tetrahedron"))
			{
				count+=4;
			}
			else if(s.equals("Cube"))
			{
				count+=6;
			}
			else if(s.equals("Octahedron"))
			{
				count+=8;
			}
			else if(s.equals("Dodecahedron"))
			{
				count+=12;
			}
			else if(s.equals("Icosahedron"))
			{
				//20
				count+=20;
			}
			else
			{
				System.out.println("Not found");
			}
		}
		System.out.println(count);
	}
}