// Lab 10
// Jonathan Starkey
// 61075
import java.util.ArrayList;
import java.util.*;

public class ObjectCalculator
{
	public static void main(String args[])
	{
		ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();
		
		// Create a Scanner to read input from the keyboard
		
		Scanner scan = new Scanner(System.in);
		
		// Prompt the user for a radius, get the radius from
		// the keyboard, and add the circle to the list of objects.
		
		System.out.println("enter a circle radius");
		double radius = scan.nextDouble();
		objects.add(new Circle(radius));
		
		
		// Prompt the user for a side length for an equilateral triangle.
		// Create an equilateral triangle with that side length and
		// add it to the list of objects.
		
		System.out.println("enter triangle side");
		double sidelength = scan.nextDouble();
		
		objects.add(new EquilateralTriangle(sidelength));
		
		// Prompt the user for the width and height of a rectangle.
		// Create a rectangle with that width and height and add it
		// to the list of objects.
		
		System.out.println("enter rectangle width");

		double width = scan.nextDouble();

		System.out.println("enter rectangle height");

		double height = scan.nextDouble();
		scan.close();
		
		objects.add(new Rectangle(width , height));
		//objects.add(new Rectangle(height));
		
		
		// Write a for loop that will print out all of the objects
		// in the list, along with their attributes (radius for circle,
		// width and height for rectangle, and side length for
		// equilateral triangle).
		
		for(int i =0; i<objects.size(); i++)
		{
			System.out.println(objects.get(i));
		}
	
		
		
		// Write code that will calculate and print the total perimeter
		// and total area of all the objects in the list.
		// [Add code here]
		//System.out.println(Rectangle.getArea());
	}
}
