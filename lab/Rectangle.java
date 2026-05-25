// 1. Write a program to create a class Rectangle with the following information: length, breadth in integer.  

// Add two constructors, (a) default constructor, and (b) constructor to pass on length and breadth of a Rectangle. 

// Add a method printData( ) to print the two information about the rectangle in console. 

// Add methods printArea( ) and printPerimeter( ) to compute and print the area and perimeter of rectangle in console. 

// Create two objects of this class, r1 and r2. Show the output of both the constructors and all method of these two objects. 


public class Rectangle{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(10.0,20.0);
		Rectangle r2=new Rectangle(20.10,10.56);
		System.out.println("R1 rectangle :");
		r1.printArea();
		r1.printPerimeter();
		System.out.println("R2 rectangle: ");
		r2.printArea();
		r2.printPerimeter();
	}
	double length;
	double breath;
	public Rectangle()
	{

	}
	public Rectangle(double length,double breath)
	{	
		this.length=length;
		this.breath=breath;
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