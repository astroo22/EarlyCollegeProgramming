import java.util.*;

public class CalcStuff
{
	public HashMap<String, Double> memory = new HashMap<>();

	memory.get(variableName);
	memory.put(variableName, variableValue);
	if (memory.containsKey(variableName))

	public static double evaluate(String[] tokens, int startPos)
	{
		Stack<Double> stack = new Stack<Double>();

		for (int i=startPos; )


			if (tokens[i].equals("^"))
			{
				double b = stack.pop();
				double a = stack.pop();
				double res = Math.pow(a,b);
				stack.push(res);
			}

	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		// 0 1 2 3 4
		// a b * 3 +

		// 0     1 2 3 4 5 6
		// cable = a b * 3 +

		while (true)
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

			}
			else if (tokens.length > 1 && tokens[1].equals("="))
			{

			}
		}
	}
}