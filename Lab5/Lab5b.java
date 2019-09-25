// Lab 5b
// <Jonathan Starkey>
// <61075>

import java.util.*;

public class Lab5b
{
	
	public static void main(String args[])
	{
		double[] a = {1, 0, 0};
		double[] b = {0, 1, 1};
		double[] c = {1, 1, 1};
		double[] d = {0, 0, 1};
		double ab = ab(a,b);
		double ac = ac(a,c);
		double ad = ad(a,d);
		System.out.println("ab=" + ab + ", ac=" + ac + ", ad=" + ad);
	}
	public static double ab(double[] a, double[] b)
	{
		double ab = Math.sqrt((a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]) + (a[2]-b[2])*(a[2]-b[2]) );
		return ab;
	}
	
	public static double ac (double[] a, double[] c)
	{
		double ac = Math.sqrt((a[0]-c[0])*(a[0]-c[0]) + (a[1]-c[1])*(a[1]-c[1]) + (a[2]-c[2])*(a[2]-c[2]) );
		return ac;
	}
	
	public static double ad(double[] a, double[] d)
	{
		double ad = Math.sqrt((a[0]-d[0])*(a[0]-d[0]) + (a[1]-d[1])*(a[1]-d[1]) + (a[2]-d[2])*(a[2]-d[2]) );
		return ad;

	}
	
}
