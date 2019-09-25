//========================================
//Semester : <fall 2016>
// <Jonathan Starkey>
// 61075
//=========================================

import java.util.*;
import java.io.File;
public class Program4
{
	public static void main(String[] args)
	{
		
		if (args.length>0)
		{
			String start = args[0];
			if (start.equals("-e"))
			{
				if (args.length>0)
				{
			
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				
				System.out.println(convert2Morse(input));
				
				}
			
		
			}
			else if (start.equals("-d"))
			{	
				if (args.length>0)
				{
				Scanner scan = new Scanner(System.in).useDelimiter(" ");
				
				String input = scan.nextLine();
				//.out.println(input);
				
				System.out.println(convert2String(input));
				}
			}
		
		
		
		//String length = input.nextString();
		//String[] array = new string[length];
		//int length = args[1].length();
		//String[] file = new String[length];
		
		
		//String file = new Scanner(new File(args[1])).useDelimiter("\\z").next();
		//String file = args[1];
		//System.out.println(file);
		
		
		
		//int l = fil.length();
		//String[] file = new String[l];
		
		
		
		
		}
		else 
		{
			System.out.println("Morse Code program by <Jonathan Starkey>");
			System.out.println("usage java MorseCode [-e, -d] < inputFile > outputFile");
		}
		 
		
	}
	public static String convert2Morse(String input)
	{
		String currentChar;
		String morseChar;
		String converted2String = "";
		//int length = file.length;
		
		
		for (int i = 0; i < input.length(); i++)
		{
			currentChar = input.charAt(i) + "";
			
			 
			 
				morseChar = conversion1(currentChar);
				converted2String = converted2String + morseChar;
			 
			
			
		}
		return converted2String;
	}
	public static String convert2String(String input)
	{
		Scanner input1 = new Scanner(input).useDelimiter(" ");
		String currentChar;
		String morseChar;
		String converted2String = "";
		while (input1.hasNext())
		{
			currentChar = input1.next() + "";
			morseChar = convert2Norm(currentChar);
			converted2String = converted2String + morseChar;
			//System.out.println(test);
			if (morseChar.equals(" ")) 
            {
               converted2String = converted2String;
            }
           
            else
            {
                
                if (!morseChar.equals(" "))
                {
                    converted2String = converted2String + "";
                }
            }
			
		}
		//int length = file.length;
		return converted2String;
	}
	public static String convert2Norm(String temp2)
	{
		String code2 = temp2;
		if (temp2.equalsIgnoreCase(".-"))
            code2 = "a";
        if (temp2.equalsIgnoreCase("-..."))
            code2 = "b";
        if (temp2.equalsIgnoreCase("-.-."))
            code2 = "c";
        if (temp2.equalsIgnoreCase("-.."))
            code2 = "d";
        if (temp2.equalsIgnoreCase("."))
            code2 = "e";
        if (temp2.equalsIgnoreCase("..-."))
            code2 = "f";
        if (temp2.equalsIgnoreCase("--."))
            code2 = "g";
        if (temp2.equalsIgnoreCase("...."))
            code2 = "h";
        if (temp2.equalsIgnoreCase(".."))
            code2 = "i";
        if (temp2.equalsIgnoreCase(".---"))
            code2 = "j";
        if (temp2.equalsIgnoreCase("-.-"))
            code2 = "k";
        if (temp2.equalsIgnoreCase(".-.."))
            code2 = "l";
        if (temp2.equalsIgnoreCase("--"))
            code2 = "m";
        if (temp2.equalsIgnoreCase("-."))
            code2 = "n";
        if (temp2.equalsIgnoreCase("---"))
            code2 = "o";
        if (temp2.equalsIgnoreCase(".--."))
            code2 = "p";
        if (temp2.equalsIgnoreCase("--.-"))
            code2 = "q";
        if (temp2.equalsIgnoreCase(".-."))
            code2 = "r";
        if (temp2.equalsIgnoreCase("..."))
            code2 = "s";
        if (temp2.equalsIgnoreCase("-"))
            code2 = "t";
        if (temp2.equalsIgnoreCase("..-"))
            code2 = "u";
        if (temp2.equalsIgnoreCase("...-"))
            code2 = "v";
        if (temp2.equalsIgnoreCase(".--"))
            code2 = "w";
        if (temp2.equalsIgnoreCase("-..-"))
            code2 = "x";
        if (temp2.equalsIgnoreCase("-.--"))
            code2 = "y";
        if (temp2.equalsIgnoreCase("--.."))
            code2 = "z";
        if (temp2.equalsIgnoreCase("-----"))
            code2 = "0";
        if (temp2.equalsIgnoreCase(".----"))
            code2 = "1";
        if (temp2.equalsIgnoreCase("..---"))
            code2 = "2";
        if (temp2.equalsIgnoreCase("...--"))
            code2 = "3";
        if (temp2.equalsIgnoreCase("....-"))
            code2 = "4";
        if (temp2.equalsIgnoreCase("....."))
            code2 = "5";
        if (temp2.equalsIgnoreCase("-...."))
            code2 = "6";
        if (temp2.equalsIgnoreCase("--..."))
            code2 = "7";
        if (temp2.equalsIgnoreCase("---.."))
            code2 = "8";
        if (temp2.equalsIgnoreCase("----."))
            code2 = "9";
        if (temp2.equalsIgnoreCase(""))
            code2 = " ";
		return code2;
	}
	public static String conversion1 (String temp1)
	{
		String code = temp1;
		if (temp1.equalsIgnoreCase("a"))
			code = ".- ";
		if (temp1.equalsIgnoreCase("b"))
			code = "-... ";
		if (temp1.equalsIgnoreCase("c"))
			code = "-.-. ";
		if (temp1.equalsIgnoreCase("d"))
			code = "-.. ";
		if (temp1.equalsIgnoreCase("e"))
			code = ". ";
		if (temp1.equalsIgnoreCase("f"))
			code = "..-. ";
		if (temp1.equalsIgnoreCase("g"))
			code = "--. ";
		if (temp1.equalsIgnoreCase("h"))
			code = ".... ";
		if (temp1.equalsIgnoreCase("i"))
			code = ".. ";
		if (temp1.equalsIgnoreCase("j"))
			code = ".--- ";
		if (temp1.equalsIgnoreCase("k"))
			code = "-.- ";
		if (temp1.equalsIgnoreCase("l"))
			code = ".-.. ";
		if (temp1.equalsIgnoreCase("m"))
			code = "-- ";
		if (temp1.equalsIgnoreCase("n"))
			code = "-. ";
		if (temp1.equalsIgnoreCase("o"))
			code = "--- ";
		if (temp1.equalsIgnoreCase("p"))
			code = ".--. ";
		if (temp1.equalsIgnoreCase("q"))
			code = "--.- ";
		if (temp1.equalsIgnoreCase("r"))
			code = ".-. ";
		if (temp1.equalsIgnoreCase("s"))
			code = "... ";
		if (temp1.equalsIgnoreCase("t"))
			code = "- ";
		if (temp1.equalsIgnoreCase("u"))
			code = "..- ";
		if (temp1.equalsIgnoreCase("v"))
			code = "...- ";
		if (temp1.equalsIgnoreCase("w"))
			code = ".-- ";
		if (temp1.equalsIgnoreCase("x"))
			code = "-..- ";
		if (temp1.equalsIgnoreCase("y"))
			code = "-.-- ";
		if (temp1.equalsIgnoreCase("z"))
			code = "--.. ";
		if (temp1.equalsIgnoreCase("1"))
			code = ".---- ";
		if (temp1.equalsIgnoreCase("2"))
			code = "..--- ";
		if (temp1.equalsIgnoreCase("3"))
			code = "...-- ";
		if (temp1.equalsIgnoreCase("4"))
			code = "....- ";
		if (temp1.equalsIgnoreCase("5"))
			code = "..... ";
		if (temp1.equalsIgnoreCase("6"))
			code = "-.... ";
		if (temp1.equalsIgnoreCase("7"))
			code = "--... ";
		if (temp1.equalsIgnoreCase("8"))
			code = "---.. ";
		if (temp1.equalsIgnoreCase("9"))
			code = "----. ";
		if (temp1.equalsIgnoreCase("0"))
			code = "----- ";
		if (temp1.equalsIgnoreCase(" "))
			code = " ";
		if (temp1.equalsIgnoreCase("!"))
			code = "";
		if (temp1.equalsIgnoreCase("@"))
			code = "";
		if (temp1.equalsIgnoreCase("#"))
			code = "";
		if (temp1.equalsIgnoreCase("$"))
			code = "";
		if (temp1.equalsIgnoreCase("%"))
			code = "";
		if (temp1.equalsIgnoreCase("^"))
			code = "";
		if (temp1.equalsIgnoreCase("&"))
			code = "";
		if (temp1.equalsIgnoreCase("*"))
			code = "";
		if (temp1.equalsIgnoreCase("("))
			code = "";
		if (temp1.equalsIgnoreCase(")"))
			code = "";
		if (temp1.equalsIgnoreCase("_"))
			code = "";
		if (temp1.equalsIgnoreCase("+"))
			code = "";
		if (temp1.equalsIgnoreCase("="))
			code = "";
		if (temp1.equalsIgnoreCase("-"))
			code = "";
		if (temp1.equalsIgnoreCase("?"))
			code = "";
		if (temp1.equalsIgnoreCase("/"))
			code = "";
		if (temp1.equalsIgnoreCase("<"))
			code = "";
		if (temp1.equalsIgnoreCase(">"))
			code = "";
		if (temp1.equalsIgnoreCase(","))
			code = "";
		
		//System.out.print("[" + temp1 + "] ");
		//System.out.println("[" + code +"]");
		return code;
		
	}
}