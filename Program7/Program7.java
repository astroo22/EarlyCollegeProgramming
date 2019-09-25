// Program 7
// <Jonathan Starkey>
// <61075>


import java.io.*;
import java.util.*;

public class Program7
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Program 7 by Jonathan Starkey");
			
			
			Scanner scan = new Scanner(new File(args[0]));
			int i = 0;
			String className;
			String section;
			int linenumber = 0;
			Scanner scan2 = new Scanner(new File(args[0]));
			
			while (scan2.hasNextLine())
			{
				linenumber++;
				scan2.nextLine();
			}
			scan2.close();
			
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			String cName = tokens[0];
			String sName = tokens[1];
			String[] asmName = new String[tokens.length-2];
			for(i=2; i< tokens.length; i++)
			{
				asmName[i-2] = tokens[i];
			}
			
			String line2 = scan.nextLine();
			String[] tokens2 = line2.split(",");
			int[] asmInfo = new int[tokens.length-2];
			for (i=2; i < tokens.length; i++)
			{
				asmInfo[i-2] = Integer.parseInt(tokens2[i]);
			}
			String[][] grades = grades = new String[linenumber -2][tokens2.length];
			
			int r = 0;
			while (scan.hasNext())
			{
				
				String line3 = scan.nextLine();
				String[] tokens3 = line3.split(",");
				
				
				
				for(int c = 0; c < tokens2.length ; c++)
				{
					grades[r][c] = tokens3[c];
				}
										
				r++;
			}
			
			System.out.println(Arrays.toString(asmName));
			System.out.println(Arrays.toString(asmInfo));
			System.out.println(Arrays.deepToString(grades));
			
			while (true)
			{
				System.out.print("> ");
				Scanner keyboard = new Scanner(System.in);
				String a = keyboard.nextLine();
				if(a.equalsIgnoreCase("report"))
				{
					System.out.println("Grade breakdown for " + cName + ", " + sName);
					int sum10 = 0;
					for (int inT: asmInfo)
					sum10 += inT;
					double sum11 = 0; 
					int aC1=0;
					int bC1=0;
					int cC1=0;
					int dC1=0;
					int fC1=0;
					int sum12=0;
					double max1 = 0;
					double min1 = 100;
					double average1 = 0;
					int secondaryCounter2 = 0;
					
					for (int ii=0; ii<linenumber-2; ii++)
					{
						for (int iic = 0; iic<grades[ii].length -2; iic++)
						{
							sum11 += Double.parseDouble(grades[ii][iic+2]);
							
						}	
						System.out.println(sum11);
						double gpa = sum11/sum10;
						sum12 += sum11;
						if(gpa <=1.00 && gpa>=.90)
						{
							
							aC1++;
						}
						if(gpa <=.89 && gpa>=.80)
						{
							
							bC1++;
						}
						if(gpa <=.79 && gpa>=.70)
						{
							
							cC1++;
						}
						if(gpa <=.69 && gpa>=.60)
						{
							
							dC1++;
						}
						if(gpa <=.59 && gpa>=0)
						{
							
							fC1++;
						}
						if (sum11 > max1)
						{
							max1 = sum11;
						}
						if (sum11 < min1)
						{
							min1 = sum11;
						}
						sum11 = 0;
						secondaryCounter2++;
						
						
					}
					System.out.println("Low: " + min1 +"%");
					System.out.println("High: " + max1 + "%");
					System.out.println("Ave: " + sum12/secondaryCounter2 + "%");
					
					
					System.out.println("A:  " + aC1);
					System.out.println("B:  " + bC1);
					System.out.println("C:  " + cC1);
					System.out.println("D:  " + dC1);
					System.out.println("F:  " + fC1);
					
				}
				if(a.equalsIgnoreCase("Help"))
				{
					System.out.println("Please input a file");
					System.out.println("Once a file has been imported You can type:");
					System.out.println("Exit (Causes Program to exit)");
					System.out.println("Help (Prints a list of accepted commands)");
					System.out.println("Roll (Prints out a list of students from the class and all of their data)");
					System.out.println("Search (Searches for a student with a first or last name that matches the partial name given)");
					System.out.println("Assignments (Prints out a list of assignments from the file + points possible)");
					System.out.println("Student (Prints a report for the specified student)");
					System.out.println("Assignment [assignment name] (Prints a report about a particular assignment");
					System.out.println("Report (Prints a report about overall grades in the class)");
				}
				if(a.equalsIgnoreCase("roll"))
				{
					int sum = 0;
					for (int p: asmInfo)
					sum += p;
					System.out.println("Student Grades for " + cName + ", " + sName);
					System.out.println("Total points possible: " + sum);
					System.out.println(" ");
					System.out.println("First Name    Last Name    Points  Grade"); 
					System.out.println("__________    _________    ______  _____");
					String gg = null;
					
					for(int q = 0; q < grades.length; q++)
					{
						double sum2 =0;
						for (int j=2; j<grades[0].length;j++)
						{
							sum2 += Double.parseDouble(grades[q][j]);
							
						}
							
							
							double pointT = sum2/sum;
							//System.out.println(sum + " " + pointT + " " + sum2);
							if(pointT <=1.00 && pointT>=.90)
							{
								gg = "A";
							}
							if(pointT <=.89 && pointT>=.80)
							{
								gg = "B";
							}
							if(pointT <=.79 && pointT>=.70)
							{
								gg = "C";
							}
							if(pointT <=.69 && pointT>=.60)
							{
								gg = "D";
							}
							if(pointT <=.59 && pointT>=0)
							{
								gg = "F";
							}
							
						System.out.printf("%-14s %-13s %-8s %-5s%n" , grades[q][0], grades[q][1], sum2, gg);
					}
					
					
					
					
				}
				
				if(a.equalsIgnoreCase("Students"))
				{
					System.out.println("Which student would you like to see?");
					String x = keyboard.nextLine();
					int sum8 = 0;
					for (int ppp: asmInfo)
					sum8 += ppp;
					double sum9 = 0;
					String ggtt = null;
					int vv = 0;
					int jjjj = 0;
					String total = "Total";
					String g2g = null;
					for (int tt=0; tt<linenumber-2; tt++)
					{
						for (int ggss=0; ggss<2; ggss++)
						{
							if(grades[tt][ggss].contains(x))
								
							{
								System.out.println("Assignment    Points  Possible");
								System.out.println("__________    ______  ________");
								for(int hh = 0; hh<grades[tt].length-2; hh++)
								{
									sum9 += Double.parseDouble(grades[tt][hh+2]);
								}
								for(int jjj = 0; jjj<grades[tt].length-2; jjj++)
								{
									System.out.printf("%-10s %9d %9d%n" , asmName[jjj], Integer.parseInt(grades[tt][jjjj+2]), asmInfo[jjj]);
									jjjj++;
								}
								System.out.printf("%-10s %9.0f %9d%n" , total, sum9, sum8);
								System.out.println(" ");
								
								double pointTtT =  sum9/sum8;
								//System.out.println(sum + " " + pointTtT + " " + sum2);
								if(pointTtT <=1.00 && pointTtT>=.90)
								{
									g2g = "A";
								}
								if(pointTtT <=.89 && pointTtT>=.80)
								{
									g2g = "B";
								}
								if(pointTtT <=.79 && pointTtT>=.70)
								{
									g2g = "C";
								}
								if(pointTtT <=.69 && pointTtT>=.60)
								{
									g2g = "D";
								}
								if(pointTtT <=.59 && pointTtT>=0)
								{
									g2g = "F";
								}
								
								System.out.println("Final Grade: " + g2g);
								vv++;
							}	
						}
					}
					if (vv == 0)
					{
						System.out.println("Sorry couldn't find that student.");
						System.out.println("Please check spelling and remember this is case Sensitive");
						
					}
					
				}
				
				if(a.equalsIgnoreCase("assignments"))
				{
					System.out.println("Assignments for " + cName + ", " + sName);
					System.out.println(" ");
					System.out.println("Assignment    Points");
					System.out.println("----------    ------");
					for (int e = 0; e<asmName.length; e++)
					{
						System.out.printf("%-10s %9d%n" , asmName[e], asmInfo[e]);
					}
				}
				
				if(a.equalsIgnoreCase("search"))
				{
					System.out.println("Which student would you like to see?");
					String c = keyboard.nextLine();
					int sum6 = 0;
					for (int pp: asmInfo)
					sum6 += pp;
					double sum7 = 0;
					String ggt = null;
					System.out.println("First Name    Last Name    Points  Grade"); 
					System.out.println("__________    _________    ______  _____");
					int v = 0;
					for (int g=0; g<linenumber-2; g++)
					{
						for (int ggs=0; ggs<2; ggs++)
						{
							if(grades[g][ggs].contains(c))
							{
								sum7 =0;
								for(int h = 0; h<grades[g].length-2; h++)
								{
									sum7 += Double.parseDouble(grades[g][h+2]);
								}
								double pointTt = sum7/sum6;
								//System.out.println(sum + " " + pointTt + " " + sum2);
								if(pointTt <=1.00 && pointTt>=.90)
								{
									ggt = "A";
								}
								if(pointTt <=.89 && pointTt>=.80)
								{
									ggt = "B";
								}
								if(pointTt <=.79 && pointTt>=.70)
								{
									ggt = "C";
								}
								if(pointTt <=.69 && pointTt>=.60)
								{
									ggt = "D";
								}
								if(pointTt <=.59 && pointTt>=0)
								{
									ggt = "F";
								}
								System.out.printf("%-14s %-13s %-8s %-5s%n" , grades[g][0], grades[g][1], sum7, ggt);
								v++;
							}
							
						}
						
					}
					if(v == 0)
					{
						System.out.println("Sorry couldn't find that student.");
						System.out.println("Please check spelling and remember this is case Sensitive");
					}
					
				}
				
				if(a.equalsIgnoreCase("assignment"))
				{
					
					System.out.println("which assignment would you like to see?");
					String b = keyboard.nextLine();
					
					System.out.println("grade breakdown");
					
					double sum3 = 0;
					int sum4 = 0;
					int sum5 = 0;
					for (int p: asmInfo)
					sum4 += p;
					int aC=0;
					int bC=0;
					int cC=0;
					int dC=0;
					int fC=0;
					String ggg;
					double max = 0;
					double min = 100;
					double average = 0;
					int secondaryCounter = 0;
					
					
					for(int w = 0; w<asmName.length; w++)
					{
						if(asmName[w].contains(b))
						{
							for(int ww = 0; ww < linenumber-2; ww++)
							{
								double points = asmInfo[w];
								secondaryCounter = ww;
								sum3 += Double.parseDouble(grades[ww][w+2]);
								sum5 += sum3;
								double pointTt = sum3/points;
								//System.out.println(sum3 + " " + pointTt + " " + points);
								if(pointTt <=1.00 && pointTt>=.90)
								{
									//ggg = "A";
									aC++;
								}
								if(pointTt <=.89 && pointTt>=.80)
								{
									//ggg = "B";
									bC++;
								}
								if(pointTt <=.79 && pointTt>=.70)
								{
									//ggg = "C";
									cC++;
								}
								if(pointTt <=.69 && pointTt>=.60)
								{
									//ggg = "D";
									dC++;
								}
								if(pointTt <=.59 && pointTt>=0)
								{
									//ggg = "F";
									fC++;
								}
								if (sum3 > max)
								{
									max = sum3;
								}
								if (sum3 < min)
								{
									min = sum3;
								}
								sum3 = 0;
								
							}
							average = sum5/secondaryCounter-2;
							System.out.println(b + "    Points possible: " + asmInfo[w]);
							System.out.println("Average: " + average);
							System.out.println("High: " + max);
							System.out.println("Low: " + min);
								
							
							System.out.println("A:  " + aC);
							System.out.println("B:  " + bC);
							System.out.println("C:  " + cC);
							System.out.println("D:  " + dC);
							System.out.println("F:  " + fC);
							break;
						}
						else
						{
							
							continue;
						}
						
						
						
					}
				}
				
				if(a.equalsIgnoreCase("exit"))
				{
					break;
				}
				
				
				
				/*
				
				else  
				{
					
					System.out.println("Please input a file");
					System.out.println("Once a file has been imported You can type:");
					System.out.println("Exit (Causes Program to exit)");
					System.out.println("Help (Prints a list of accepted commands)");
					System.out.println("Roll (Prints out a list of students from the class and all of their data)");
					System.out.println("Search (Searches for a student with a first or last name that matches the partial name given)");
					System.out.println("Assignments (Prints out a list of assignments from the file + points possible)");
					System.out.println("Student (Prints a report for the specified student)");
					System.out.println("Assignment [assignment name] (Prints a report about a particular assignment");
					System.out.println("Report (Prints a report about overall grades in the class)");
				
				}
				*/
				
			}
			
		}
		catch (IOException|ArrayIndexOutOfBoundsException ex)
		{
			
			System.out.println("Please input a file");
			System.out.println("Once a file has been imported You can type:");
			System.out.println("Exit (Causes Program to exit)");
			System.out.println("Help (Prints a list of accepted commands)");
			System.out.println("Roll (Prints out a list of students from the class and all of their data)");
			System.out.println("Search (Searches for a student with a first or last name that matches the partial name given)");
			System.out.println("Assignments (Prints out a list of assignments from the file + points possible)");
			System.out.println("Student (Prints a full report for the specified or partially specified student)");
			System.out.println("Assignment [assignment name] (Prints a report about a particular assignment");
			System.out.println("Report (Prints a report about overall grades in the class)");
			System.exit(0);
			
		}
		
		
	}
	
}