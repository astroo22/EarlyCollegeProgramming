// Lab 5c
// <Jonathan Starkey>
// <61075>

import java.util.*;

public class Lab5c
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
			Scanner lineScan = new Scanner(line);
			
			// Write a while loop that will sum all of the
			// double values on the line (hint: create double
			// variables called "sum", "product", and "count".  
			// Set sum and count to 0, and product to 1.
			// Then read as many double values
			// as you can using the while loop  When you read
			// a number, add it to sum, multiply product by it,
			// and add 1 to count. 
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
			
			// Print out the sum, product, and average on one line 
			System.out.println("Sum = " + sum + "Product = " + product + "Average = " + average);
		}
	}
}