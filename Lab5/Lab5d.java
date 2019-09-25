// Lab 5d
// <Jonathan Starkey>
// <61075>

import java.util.*;

public class Lab5d
{
	public static void main(String args[])
	{
		// Make a scanner from System.in
		Scanner scan = new Scanner(System.in);
		
		// Process each line separately
		// If the next token is a double, assume there is an input line
		

		while (scan.hasNextDouble()) 
		{
			// Get a line from the input 
			//int n = Integer.parseInt(args[0]);
			String line = scan.nextLine();
			
			// Create a scanner for the line of input you have read
			
			
			processLine(line);
			
		}
		
	}
	public static void processLine(String line)
	{
			Scanner lineScan = new Scanner(line);
		double sum = 0;
			double count = 0;
			double product = 1;
			while(lineScan.hasNextDouble())
			{
				double d = lineScan.nextDouble();
				sum = sum + d;
				
				product = product *sum;
				count++;
			}
			

			// Compute the average by dividing sum by count
			double average = sum/count;
			System.out.println("Sum = " + sum + "Product = " + product + "Average = " + average);
	}
}