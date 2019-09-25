// Lab 4a
// <Jonathan Starkey>
// <61075>
// This program will print user's current academic year given by the user.

import java.util.*;

public class Lab4a
{
	public static void main(String[] args)
	{
		// Declare five String constants, one for each year of possible input.
		final String YEAR1 = "Freshman";
		final String YEAR2 = "Sophmore";
		final String YEAR3 = "Junior";
		final String YEAR4 = "Senior";
		
		final String YEAR5 = "grad";

		// User input for current year
		int academicYear;

		// Create a Scanner Object to read in data.
		Scanner scan = new Scanner(System.in);

		// Write code to prompt the user for a year number.
		// Then, store the input into acedemicYear. You may assume that 
		// the user will enter a valid number.
		System.out.println("Please enter a year number!");
		int answer = scan.nextInt();

		// Write a series of if ... else if ... else statements
		// to print out what year you are based on the int read in.  
		// If a 1 is entered print "Freshman"
		// If a 2 is entered print "Sophomore"
		// If a 3 is entered print "Junior"
		// If a 4 is entered print "Senior"
		// If a 5 is entered print "grad"
		// If something beside those five numbers was entered,
		// Print an error message and quit the program.
		if (answer == 1)
		{
			System.out.println("Freshman");
		}
		else if (answer == 2) 
		{
			System.out.println("Sophmore");
		}
		else if (answer == 3)
		{
			System.out.println("Junior");
		}			
		else if (answer == 4) 
		{
			System.out.println("Senior");
		}
		else if (answer == 5) 
		{
			System.out.println("Grad");
		}
		else 
		{
			System.out.println("Error");
		}

	} // End of main()
} // End of class