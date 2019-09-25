import java.io.*;
import java.util.*;
public class grades
		{
			
			public String firstName;
			public String lastName;
			public double g1;
			public double g2;
			public double g3;
			public double g4;
			public double g5;
			
			
			public grades(String f, String l, double grade1, double grade2, double grade3, double grade4, double grade5)
			{
				firstName = l;
				lastName = f;
				g1 = grade1;
				g2 = grade2;
				g3 = grade3;
				g4 = grade4;
				g5 = grade5;
				
				
			}
			/*
			public String toString()
			{
				return firstName + "," + lastName + "," + g1 + "," + g2 + "," + g3 + "," + g4 + "," + g5;
			}*/
		}