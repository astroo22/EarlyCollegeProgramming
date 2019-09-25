// Lab 7b
// (Name)
// (Section)

import java.util.*;

public class Lab7b
{
	public static void main(String args[])
	{
		// Create a new HashMap called "songStars"
		HashMap<String, Integer> songStars = new HashMap<String, Integer>();
		
		// Yes, you can find all these on Youtube.
		songStars.put("The ballad of Bilbo Baggins", 5);
		songStars.put("A still more glorious dawn", 4);
		songStars.put("A finite simple group of order two", 4);
		songStars.put("Code monkey", 4);
		songStars.put("Fish heads", 2);
		songStars.put("I'll form the head", 3);
		songStars.put("Honeybee", 5);
		songStars.put("Revolution 9", 1);
		
		// Get the number of stars for "Code monkey", and print the # of stars
		// [Your code here]
		int cM = songStars.get("Code monkey");
		System.out.println(cM);
		
		
		
		// Remove the song "Revolution 9"
		// [Your code here]
		songStars.remove("Revolution 9");
		
		// Determine if "Revolution 9" is still in the table.
		// If it is in the table, print "Revolution 9 still in table".
		// Otherwise print "Successfully removed Revolution 9".
		// [Your code here]
		int temp1 = songStars.size();
		if(temp1 == 8)
		{
			System.out.println("Revolution 9 still in table");
		}
		else
		{
			System.out.println("Successfully removed Revolution 9");
		}
	}
}