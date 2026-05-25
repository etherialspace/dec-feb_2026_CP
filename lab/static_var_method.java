 // Design and implement a Java program that illustrates the use of static variables and static methods.
public class static_var_method
{
	public static void main(String[] args)
	{
		Rectangle.message();//static method
		Rectangle r1=new Rectangle(10,20);
		Rectangle r2=new Rectangle(20,30);
		System.out.println("R1 Rectangle");//static variables
		r1.printData();
		System.out.println("R2 Rectangle");//static variables
		r2.printData();
		

	}
}
class Rectangle{
	static double length;
	static double breath;
	public Rectangle()
	{

	}
	public Rectangle(double length,double breath)
	{	
		this.length=length;
		this.breath=breath;
	}
	static public void message()
	{
		System.out.println("Type Length and breath");
	}
	public void printData()
	{
		System.out.println("Length="+this.length+" Breath="+this.breath);
	}

	public void printArea()
	{
		System.out.println("Area="+this.length*this.breath);
	}
	public void printPerimeter()
	{
		System.out.println("Perimeter="+2*(this.length+this.breath));
	}
}