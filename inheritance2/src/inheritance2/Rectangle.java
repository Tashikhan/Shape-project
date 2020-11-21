package inheritance2;
public class Rectangle extends Shape
{
	double width, length;
	Rectangle ()
	{
		width = 1.0;
		length = 1.0;
	}
	Rectangle (double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	Rectangle (double width, double length , String colour , boolean filled)
	{
		this.width = width;
		this.length = length;
		this.colour= colour;
		this.filled = filled;
	}
	public double getwidth()
	{
		return width;
	}
	public double getlength()
	{
		return length;
	}
	void setwidth(double width)
	{
		this.width = width;
	}
	void setlength(double length)
	{
		this.length = length;
	}
	
	public double getarea()
	{
		
		return length*width;
	}
	
	public double getperimter()
	{
		return 2*(length+width);
	}
	
	public String toString ()
	{
		return "A Rectangle with width = " + getwidth() + " and length = " + getlength() + " ,which is a subclass of " + super.toString();	
	}
	
}
