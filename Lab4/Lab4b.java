// Lab 4b
// <Jonathan Starkey>
// <61075>

// This program will read in from a file a series of numbers in degrees
// Celsius, convert them to degree Fahrenheit and print out a table of 
// those values.  The file input is handled using the command line's 
// redirection mechanism.

import java.util.Scanner;

public class Lab4b
{
   public static void main(String[] args)
   {
      // Declare variables
      Scanner scan = new Scanner(System.in);

      double degreeCelsius;
      double degreeFahrenheit;

      // Print to the screen the header of the output table
      // as seen in the sample run below.
      // There are two lines in the header.
      // Make sure it has the right spacing to line up with the table.
		System.out.println("java Lab4b < lab 4data.txt");
		System.out.println("Celsius     |	Fahrenheit");
		System.out.println("------------+-------------");
	  
      // Write your loop here
      // We want to loop until there are no more inputs to be read. 
		//Double input;
		
      while(scan.hasNextDouble())
      {
		  
         // Check to see if the input is a double.
         // If a double read in and store in degreeCelsius.
         // If not a double print an error message and quit.
         // [Add code here]		 
			degreeCelsius = scan.nextDouble();
		 // Convert input degrees Celsius to degrees Fahrenheit
         // and store in degreeFahrenheit.
         // f = c * (9.0/5.0) + 32.0
         // [Add code here]
		 degreeFahrenheit = (degreeCelsius * (9.0/5.0) + 32.0);
		 

         // Display to the screen the output as shown in the 
         // sample run below.  Use System.out.printf.  Make sure
         // that everything lines up properly.
		 //System.out.println(degreeFahrenheit);
         System.out.printf("%12.2f",  degreeCelsius);
		 System.out.print("|");
		 System.out.printf("%13.2f%n", degreeFahrenheit);
		
			
	  
	    
	  }// End of loop
	  
   } // End of main method
} // End class
