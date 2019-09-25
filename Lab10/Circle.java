// Lab 10
// Jonathan Starkey
// 61075


public class Circle extends GeometricObject 
{
	private double radius; 
	private final double PI = 3.14;
	
	public Circle(double r)
	{
		this.radius = r;
	}
	
	public double getRadius()
	{
		return radius; 
	}

	
	public double getArea()
	{ 
		
		return PI * radius * radius;
	}
	public double getPerimeter()
	{ 	
		return 2*PI* radius;
		
	}
	public String toString()
	{
		return "Circle    radius:" + radius + " Area="+getArea() + "   Perimeter=" + getPerimeter(); 
		
		
	}
	
}