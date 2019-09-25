//========================================
// lab6b
//Semester : <fall 2016>
// <Jonathan Starkey>
// 61075
//=========================================

import java.util.*;

public class Lab6b
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		// Read in the number of data points
		int numDataPoints = scan.nextInt();

		// Create an array to hold the data points, and another to
		// hold the moving average
		double data[] = new double[numDataPoints];
		double secondDerivative[] = new double[numDataPoints];

		// Read in all of the data points using a for loop
		for (int i = 0; i<numDataPoints; i++)
		{
			data[i] = scan.nextDouble();
		}
		
		// Print out the data using printArray
		printArray(data);
		System.out.println();
		//sec[0] =0;
		//sec[numDataPoints-1]=0;
		for (int i = 0; i < numDataPoints; i++)
		{
			if (i==0)
			{
				secondDerivative[0]=0;
			}
			else if (i == numDataPoints-1)
			{
				secondDerivative[numDataPoints-1]=0;
			}
			else
			{
			secondDerivative[i] = 2*data[i] + data[i+1] - data[i-1];
			}
		}
		printArray(secondDerivative);
		// Create the second derivative for each data point
		// and save them in the secondDerivative array
		// Since the first and last elements of the array do not have
		// neighbors, set the second derivatives of those indices to 0
		// [add code here]

		// Print the second derivative array using printArray.
		// [add code here]
	}
	
	public static void printArray(double[] arr)
	{
		// Print the values of arr on a single line with spaces between them.
		System.out.println(Arrays.toString(arr));
	}
}
