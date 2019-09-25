import java.util.*;

public class Test1
{
	public static void main(String args[])
	{
	int[] b = new int[7];
    b[0] = 1;
    for (int i=2; i<7; i++)
    {
        b[i] = b[i-2] + b[i-1];
		System.out.println(b[i-2]);
    }
    //System.out.println(b);
    }
	
}