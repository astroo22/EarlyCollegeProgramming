// Lab 10
// Jonathan Starkey
// 61075


public class EquilateralTriangle extends GeometricObject 
{
	private double side1;
		
	public EquilateralTriangle(double s)
	{
		this.side1 = s;
	}
	
	public void setside1(double s)
	{
		side1 = s;
	}
	public double getside1()
	{
		return side1; 
	}

	
	public double getArea()
	{ 
		
		return (Math.sqrt(3)/(4))*(side1*side1);
	}
	public double getPerimeter()
	{ 	
		return 3 * side1;
		
	}
	public String toString()
	{
		return "Triangle  side:"+ side1 + "   Triangle area= "+ getArea() + "  Triangle Perimeter= "+ getPerimeter();
	}
	
}