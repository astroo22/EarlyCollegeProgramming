//========================================
//Semester : <fall 2016>
// <Jonathan Starkey>
// 61075
//=========================================

import java.util.*;
import java.io.*;

public class Program6
{
	public static HashMap<String, Double> memory = new HashMap<>();
	

	public static void main(String args[])
	{
	/*
	String token;
	Boolean isDouble = false;
	scanner tScan = new scanner(token);
	if (tScan.HasNextDouble()) isDouble=true;
	*/
	Scanner scan = new Scanner(System.in);
		
			System.out.println("Program 6: Post fix calculator by Jonathan Starkey");
		  
			
			while (true)
			{
				try
				{
				
				System.out.print("> ");
				String input = scan.nextLine();
				String[] tokens = input.split(" ");
				
				if (tokens[0].equals("quit"))
				{
					break;
				}
				else if (tokens[0].equals("clear"))
				{
					memory.clear();
				}
				else if (tokens[0].equals("var"))
				{
					System.out.println(memory.toString());
				}
				else if (tokens[0].equals("delete"))
				{
					memory.remove(tokens[1]);
				}
				
				else if (tokens.length > 1 && tokens[1].equals("="))
				{
						int startPos = 2;
						System.out.println(evaluate(tokens, startPos));
						memory.put(tokens[0],evaluate(tokens, startPos));
						/*
					String omg = "";
					for (int i= 2; i<tokens.length; i++)
					{
						omg = omg + tokens[i] + " ";
					}
					int startPos = 2;
					Double value = Double.parseDouble(evaluate(omg,startPos));
					memory.put(tokens[0],value);
					System.out.println(memory.get(tokens[0]));
					*/
					
				}
				else 
				{
					int startPos = 0;
					System.out.println(evaluate(tokens, startPos));
					
				}
				
				
				  
				  /*
				  int pos = 0;
				  if (evaluate(input) != null)
				  {
					  pos = evaluate(input));
					  
				  }
				  memory.put(list.get(list.size()-1),pos);
				  */
					
				}
		
			catch (Exception e) 
			{
				System.out.println("invalid Input");
			}
		}

	}
	
	public static boolean search1(String tokens)
		{
			
			
			if (memory.containsKey(tokens))
			{
					return true;
			}
			return false;
			
		}
		
		public static double search(String tokens)
		{
			
			
			if (memory.containsKey(tokens))
			{
					Double value = memory.get(tokens);
					return value;
			}
			return 0;
			
		}

		public static double evaluate(String[] tokens, int startPos)
		{
			/*
			ArrayList<String> list = new ArrayList<String>();
			if(!tokens.isEmpty())
			{
				StringTokenizer st = new StringTokenizer(tokens);
				while (st.hasMoreTokens())
				{
					list.add(st.nextToken());
				}
			}
			*/
			
			Stack<Double> stack = new Stack<Double>();
			
			

			for (int i=startPos; i<tokens.length; i++) //create the rest of this for loop )
			{
				if (search1(tokens[i]) == true)
				{
					
					stack.push(search(tokens[i]));
				}
				else if (tokens[i].equals("^"))
				{
					double b = stack.pop();
					double a = stack.pop();
					double res = Math.pow(a,b);
					stack.push(res);
				}
				else if (tokens[i].equals("*")) 
				{
					double a = stack.pop();
					double b = stack.pop();
					double result = a * b;
					stack.push(result);
				} 
				else if (tokens[i].equals("-")) 
				{
					double a = stack.pop();
					double b = stack.pop();
					double result = a - b;
					stack.push(result);
				} 
				else if (tokens[i].equals("/")) 
				{
					double a = stack.pop();
					double b = stack.pop();
					double result = a / b;
					stack.push(result);
				} 
				else if (tokens[i].equals("+")) 
				{
					double a = stack.pop();
					double b = stack.pop();
					double result = a + b;
					stack.push(result);
				}
				else 
				{                    
					stack.push(Double.parseDouble(tokens[i]));
				}

			}
			return stack.pop();
		}
		
	}


		  