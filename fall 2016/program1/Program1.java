//Semester : <fall 2016>
// <Jonathan Starkey>
// <I honestly have no idea what my section is I have labs friday at 9:30>



import java.util.Scanner;

public class Program1
{
	public static void main(String[] args)
	{
		String name;
		double age;
		String major;
		
		System.out.println("Program 1 by Jonathan Starkey");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		System.out.println("What is your major?");
		major = keyboard.nextLine();
		System.out.println("How old are you?");
		age = keyboard.nextDouble();
		System.out.print("\n" + name + " is majoring in " + major + ",");
		System.out.print(" and is ");
		System.out.print(age + " years old.");
		
	}
}