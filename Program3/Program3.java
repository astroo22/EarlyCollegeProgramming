//Semester : <fall 2016>
// <Jonathan Starkey>
// 61075


import java.util.Scanner;
public class Program3
{
	public static void main (String[] args)
	{
		final String JEDI_LEVEL = "jedi";
		final String PADOWAN_LEVEL = "padowan";
		final String YOUNGLING_LEVEL = "YoungLing";
		boolean test = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" >Java CreditCard");
		System.out.println("Credit Card program by Jonathan Starkey");
		System.out.println("What is the Customer name?");
		String name = scanner.nextLine();
		System.out.println("What is the members level?");
		String level = scanner.nextLine();
		if (level.equalsIgnoreCase(JEDI_LEVEL) || level.equalsIgnoreCase(PADOWAN_LEVEL) || level.equalsIgnoreCase(YOUNGLING_LEVEL))
		{
			test = true;
		}
		else 
		{
			test = false;
		}
		while (test == false)
		{
			System.out.println("Sorry this system did not recognize that member level. Member level must be Jedi, Padowan, or Youngling.");
			System.out.println("What is the members level?");
			level = scanner.nextLine();
			if (level.equalsIgnoreCase(JEDI_LEVEL) || level.equalsIgnoreCase(PADOWAN_LEVEL) || level.equalsIgnoreCase(YOUNGLING_LEVEL))
			test = true;
		else 
			test = false;
		}
		//if (level.equalsIgnoreCase(JEDI_LEVEL) || level.equalsIgnoreCase(PADOWAN_LEVEL) || level.equalsIgnoreCase(YOUNGLING_LEVEL))
		//{
			System.out.println("What is the Current balance?");
			double balance = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Was the payment made late?");
			String question = scanner.nextLine();
			System.out.println("Bill for customer " + name);
			System.out.printf("Card Balance: %.2f", balance );
			//System.out.println("Was the payment made late?: " + question);
			double interest = 0.0;
			String yes= "yes";
			if (level.equalsIgnoreCase(JEDI_LEVEL))
				interest = .01;
			if (level.equalsIgnoreCase(PADOWAN_LEVEL))
				interest = .018;
			if (level.equalsIgnoreCase(YOUNGLING_LEVEL)) 
				interest = .025;	
			if (question.equalsIgnoreCase(yes))
				interest = interest + .01;
			double interestP = interest*100;
			
			double principle = balance*interest;
			double totalPrinciple = balance*.04;
			double pF = principle + totalPrinciple;
			double pFLP = principle + totalPrinciple + 10.00;
			double pFLY = principle + totalPrinciple + 20.00;
			double percentToPrincipleLP = 100*(totalPrinciple/pFLP);
			
			double percentToPrincipleLY = 100*(totalPrinciple/pFLY);
			double percentToPrinciple = 100*(totalPrinciple/pF);
			double percentToInterestLP = 100 - percentToPrinciple;
			double percentToInterestLY = 100 - percentToPrincipleLY;
			double percentToInterest = 100 - percentToPrinciple;
			
		
			if (level.equalsIgnoreCase(JEDI_LEVEL))
			{
				if (question.equalsIgnoreCase(yes))
				{
					System.out.printf("\nInterest for late payment: ($%.1f", interestP); 
					System.out.printf("%% of principle): $%.2f" , principle);
					System.out.printf("\nMinimum Payment to principle (4%% of principle): $%.2f" , totalPrinciple );
					System.out.printf("\nMinimum total payment (payment and fees):%.2f" , pF );
					System.out.printf("\nPercent to principle: %.1f" , percentToPrinciple );
					System.out.printf("%%");
					System.out.printf("\nPercent to interest and fees: %.1f" , percentToInterest );
					System.out.printf("%%");
				}
				else
				{
					System.out.printf("Interest for on-time payment: ($%.1f", interestP);
					System.out.printf("%% of principle): $%.2f" , principle);
					System.out.printf("\nMinimum Payment to principle (4%% of principle): %.2f" , totalPrinciple );
					System.out.printf("\nMinimum total payment (payment and fees):%.2f" , pF );
					System.out.printf("\nPercent to principle: %.1f" , percentToPrinciple );
					System.out.printf("%%");
					System.out.printf("\nPercent to interest and fees: %.1f" , percentToInterest );
					System.out.printf("%%");
				}
			}
			else if (level.equalsIgnoreCase(PADOWAN_LEVEL))
			{
				if (question.equalsIgnoreCase(yes))
				{
					System.out.printf("\nInterest for late payment: ($%.1f", interestP); 
					System.out.printf("%% of principle): $%.2f" , principle);
					System.out.printf("\nLate fee: $10.00");
					System.out.printf("\nMinimum Payment to principle (4%% of principle): %.2f" , totalPrinciple );
					System.out.printf("\nMinimum total payment (payment and fees):%.2f" , pFLP );
					System.out.printf("\nPercent to principle: %.1f" , percentToPrincipleLP );
					System.out.printf("%%");
					System.out.printf("\nPercent to interest and fees: %.1f" , percentToInterestLP );
					System.out.printf("%%");
				}
				else
				{
					System.out.printf("Interest for on-time payment: ($%.1f", interestP);
					System.out.printf("%% of principle): $%.2f" , principle);
					System.out.printf("\nMinimum Payment to principle (4%% of principle): %.2f" , totalPrinciple );
					System.out.printf("\nMinimum total payment (payment and fees):%.2f" , pF );
					System.out.printf("\nPercent to principle: $%.1f" , percentToPrinciple );
					System.out.printf("%%");
					System.out.printf("\nPercent to interest and fees: $%.1f" , percentToInterest );
					System.out.printf("%%");
				}
			
			}
			else if (level.equalsIgnoreCase(YOUNGLING_LEVEL))
			{
				if (question.equalsIgnoreCase(yes))
				{
					System.out.printf("\nInterest for late payment: ($%.1f", interestP); 
					System.out.printf("%% of principle): $%.2f" , principle);
					System.out.printf("\nLate fee: $20.00");
					System.out.printf("\nMinimum Payment to principle (4%% of principle): %.2f" , totalPrinciple );
					System.out.printf("\nMinimum total payment (payment and fees):%.2f" , pFLY );
					System.out.printf("\nPercent to principle: $%.1f" , percentToPrincipleLY );
					System.out.printf("%%");
					System.out.printf("\nPercent to interest and fees: $%.1f" , percentToInterestLY );
					System.out.printf("%%");
				}
				else
				{
					System.out.printf("Interest for on-time payment: ($%.1f", interestP);
					System.out.printf("%% of principle): $%.2f" , principle);
					System.out.printf("\nMinimum Payment to principle (4%% of principle): %.2f" , totalPrinciple );
					System.out.printf("\nMinimum total payment (payment and fees): $%.2f" , pF );
					System.out.printf("\nPercent to principle: $%.1f" , percentToPrinciple );
					System.out.printf("%%");
					System.out.printf("\nPercent to interest and fees: %.1f" , percentToInterest );
					System.out.printf("%%");
				}
			}
			
		//}
		//else 
		//{
			
		//}
		
	}
}

	