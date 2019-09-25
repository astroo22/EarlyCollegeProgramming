//Semester : <fall 2016>
// <Jonathan Starkey>
// 61075

import java.util.Scanner;
public class Program2
{
	public static void main (String[] args)
	{
		//new scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		//heading
		System.out.println("Lab2 Solving the square by Jonathan Starkey");
		// do this stuff
		System.out.println("Please enter the values of A, B, and C.");
		// variables to hold values
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		//find out all the math things
		double form1 = Math.sqrt(b * b - 4 * a * c);
		double p = a;
		double q = b/(2*a);
		double r = c-(b*b)/(4*a);
		//set up the signs 
		String bSign ="";
		String cSign ="";
		String rSign ="";
		if (b>=0)
			bSign= "+";
		if (c>=0)
			cSign= "+";
		if (r>=0)
			rSign= "+";
		//print back everything
		System.out.println(a+ "*" + "x^2 " + bSign + b + "*x " + cSign + c + " = 0 ");
		System.out.println(p + "*(x " +bSign + q +")^2" + rSign + r + " = 0 ");
			
			
		
		/*else if(c<0)
		{
			System.out.println(a+"x^2" + " + " + b + " " + "x" +  "-" + Math.abs(c) + " = 0");
			
		}
		else if(c==0)
		{
			System.out.println(a+"x^2" + " + " + b + "x" + " + " + "0.0" + " = 0 ");
		}
		if (r>0)
		{
			System.out.println(p + "*(x + " + q + ")^2" + " + " + r + " = 0 ");
		}
		else if (r<0)
		{
			System.out.println(p + "*(x + " + q + ")^2" + " - " + Math.abs(r) + " = 0 ");
		}
		else if (r==0)
		{
			System.out.println(p + "*(x + " + q + ")^2" + " + " + "0.0" + " = 0 ");
		}
		*/
		
	}
}	