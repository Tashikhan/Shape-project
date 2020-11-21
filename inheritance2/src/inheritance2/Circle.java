package inheritance2;
public class Circle extends Shape  
{
	double radius;
	Circle()
	{
		radius = 1.0;
	}
	Circle ( double radius)
	{
		this.radius = radius;
	}
	Circle ( double radius , String colour , boolean filled)
	{
		this.radius = radius;
		this.colour= colour;
		this.filled = filled;
	}
	public double getradius()
	{
		return radius;
	}
	public void setradius(double xxx)
	{
		this.radius = xxx;
	}
	
	public double getarea()
	{
		return 3.14*radius*radius;
	}
	public double getperimter()
	{
		return 2*3.14*radius;
	}
	public String toString ()
	{
		return "A Circle with radius " + getradius() +  "which is a subclass of " + super.toString();	
	}

}

