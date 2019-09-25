// Lab 10
// Jonathan Starkey
// 61075


public class Rectangle extends GeometricObject 
{
	private double width;
	private double height;
	
	public Rectangle(double w, double h)
	{
		this.width = w;
		this.height = h;
	}
	
	public void setWidth(double w)
	{
		this.width = w;
	}
	public double getWidth()
	{
		return width; 
	}
	public void setHeight(double h)
	{
		height = h;
	}
	public double getHeight()
	{
		return height;
	}
	
	public double getArea()
	{ 
		return width * height ;
	}
	public double getPerimeter()
	{ 	
		return (2*width)  + (2* height) ;
	}	
	
	
		
	public String toString()
	{
		return String.format("Rectangle width:" + width + "  Height:"+ height+ " Area=" + getArea() + " Perimeter=" + getPerimeter());
	}
}