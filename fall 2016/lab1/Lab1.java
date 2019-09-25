//Lab1
// <Jonathan Starkey>
// <0>
import java.util.Scanner;
public class Lab1
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int iX, iY;
		
		System.out.println("please enter an integer.");
		iX = keyboard.nextInt();
		System.out.println("Please enter another integer.");
		iY = keyboard.nextInt();
		
		System.out.println("Hello there.");
		System.out.println("We hope you are having fun in lab.");
		System.out.println(iX + " + " + iY + " = " + (iX+iY));
		
	} //End of main
} //End of class 