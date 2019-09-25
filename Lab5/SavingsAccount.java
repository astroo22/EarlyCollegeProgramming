// 
// <Jonathan Starkey>
// <61075>



import java.util.*;

public class SavingsAccount
{
			private String name = "wat";
			private double balance = 1337.01;
			private static double lowInterest;
			private static double highInterest;
			private String getName()
			{
				return name;
			}
			public static double getInterest()
				{	
					return highInterest;
				}
				public static void setInterst(double highInterest)
				{
					SavingsAccount.highInterest = highInterest;
				}
				public static double getInterest2()
				{
					return lowInterest;
				}
				public static void setInterst2(double lowInterest)
				{
					SavingsAccount.lowInterest = lowInterest;
				}
				private double getBalance()
			{
				return balance;
			}
			public void setName(String name)
			{
				this.name = name;
			}
			public void setBalance(double balance)
			{
				this.balance = balance;
			}
	
	public SavingsAccount(String name, double balance)
		{
			
			this.name = name;
			this.balance = balance;
			
			
		}
}	