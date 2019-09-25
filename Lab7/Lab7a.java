// Lab 7a
// <Jonathan Starkey>
// <61075>

import java.util.*;

public class Lab7a
{
	public static void main(String args[])
	{
		ArrayList<Double> list = createSquaresList(10);
		printList(list);
		removeElement(list, 4);
		printList(list);
		swapElements(list, 2, 6);
		printList(list);
		
		double max = getMaxValue(list);
		double ave = getAverage(list);
		
		// Print the max and average
		System.out.println(max);
		System.out.println(ave);
		
		int idx1 = linearSearch(list, 4);
		int idx2 = linearSearch(list, 75);
		
		// Print the two indices
		System.out.println(idx1);
		System.out.println(idx2);
	}

	public static ArrayList<Double> createSquaresList(int n)
	{
		// Create an ArrayList with the squares of n numbers, 0 to n-1
		// Return the ArrayList
		// [Your code here]
		ArrayList<Double> tempName = new ArrayList<Double>();
		for(int i = 0; i<=n;i++)
		{
			double temp1 = i*i;
			tempName.add(temp1);
		}
		return tempName;
	}

	public static double getMaxValue(ArrayList<Double> list)
	{
		double max = Collections.max(list);
		return max;
	}
	
	public static double getAverage(ArrayList<Double> list)
	{
		Double sum = 0.0;
		for(Double myValue : list)
		{
			sum += myValue;
		}
		return sum / list.size();
		
	}
	
	public static void removeElement(ArrayList<Double> list, int index)
	{
		// Remove the specified element, replacing it with the last element
		// in the array.  Do not use list.remove(index).  Instead,
		// swap elements index and list.size()-1.  Then, remove the
		// last element in the list.
		// [Your code here]
		
		list.set(index, list.get(list.size()-1));
		list.remove(list.size()-1);
	}
	
	public static void swapElements(ArrayList<Double> list, int a, int b)
	{
		// Write code that swaps elements a and b of the ArrayList
		// Hint: you need a temporary variable.
		// [Your code here]
		double temp2 = list.get(a);
		
		list.set(a , list.get(b));
		list.set(b, temp2);
		
	}
	
	public static int linearSearch(ArrayList<Double> list, double val)
	{
		// Use a linear search to find the index of a particular value.
		// Return that index, or -1 if the value is not found.
		// Do not use list.indexOf(val)
		// [Your code here]
		int tempIndx=0;
		for (int i =0; i < list.size(); i++)
		{
			double d = list.get(i);
			if (d == val)
			{
				tempIndx = i;
				break;
			}
			else
			{
				tempIndx = -1;
			}
		}
		return tempIndx;
	}
	
	public static void printList(ArrayList<Double> list)
	{
		// Print out the number of the list on one line, separated by 
		// a comma and space, with a newline at the end.
		// [Your code here]
		for (double myValue : list)
		{
			System.out.print(myValue + ", ");
		}
		System.out.println("");
	}
}
