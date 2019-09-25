import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;


public class GameGui extends JPanel
{
	public double[] ballx = new double[11];
	public double[] bally = new double[11];
	public double[] ballw = new double[11];
	public double[] ballh = new double[11];
	/*
	public double ballx1,ballx2,ballx3,ballx4,ballx5,ballx6,ballx7,ballx8,ballx9,ballx10,ballx11,ballx12;
	public double bally1,bally2,bally3,bally4,bally5,bally6,bally7,bally8,bally9,bally10,bally11,bally12; 
	public double ballw1,ballw2,ballw3,ballw4,ballw5,ballw6,ballw7,ballw8,ballw9,ballw10,ballw11,ballw12;
	public double ballh1,ballh2,ballh3,ballh4,ballh5,ballh6,ballh7,ballh8,ballh9,ballh10,ballh11,ballh12;
	*/
	public GameGui()
	{
		//ball x axis position
		for (int bx = 0; bx<ballx.length; bx++)
		{
			if(bx ==0 || bx == 3 || bx == 6 || bx == 9)
			{
				ballx[bx] = 300;
			}
			if(bx == 1 || bx == 4 || bx == 7 || bx == 10)
			{
				ballx[bx] = 600;
				
			}
			if(bx == 2 || bx == 5 || bx == 8 || bx == 11)
			{
				ballx[bx] = 900;
			}
		}
		
		/*
		ballx1 = 300;
		ballx4 = 300;
		ballx7 = 300;
		ballx10 = 300;
		ballx2= 600;
		ballx5= 600;
		ballx8 = 600;
		ballx11 = 600;
		ballx3 = 900;
		ballx6 = 900;
		ballx9 = 900;
		ballx12 = 900;
		*/
		
		//ball y axis position
		for (int by = 0; by<bally.length; by++)
		{
			if ( by == 0|| by == 1|| by == 2)
			{
				bally[by] = 100;
			}
			if(by == 3 || by == 4 || by == 5)
			{
				bally[by] = 300;
			}
			if(by == 6 || by == 7 || by == 8)
			{
				bally[by] =500;
			}
			if ( by == 9 || by == 10 || by == 11)
			{
				bally[by] = 700;
			}
		}
		/*
		bally1 = 100;
		bally2 = 100;
		bally3 = 100;
		bally4 = 300;
		bally5 = 300;
		bally6 = 300;
		bally7 = 500;
		bally8 = 500;
		bally9 = 500;
		bally10 = 700;
		bally11 = 700;
		bally12 = 700;
		*/
		// ball width
		for (int bw = 0; bw<ballw.length; bw++)
		{
			ballw[bw] = 100;
		}
		/*
		ballw1 = 100;
		ballw2 = 100;
		ballw3 = 100;
		ballw4 = 100;
		ballw5 = 100;
		ballw6 = 100;
		ballw7 = 100;
		ballw8 = 100;
		ballw9 = 100;
		ballw10 = 100;
		ballw11 = 100;
		ballw12 = 100;
		*/
		// ball height
		for (int bh = 0; bh<ballh.length; bh++)
		{
			ballh[bh] = 100;
		}
		/*
		ballh1 = 100;
		ballh2 = 100;
		ballh3 = 100;
		ballh4 = 100;
		ballh5 = 100;
		ballh6 = 100;
		ballh7 = 100;
		ballh8 = 100;
		ballh9 = 100;
		ballh10 = 100;
		ballh11 = 100;
		ballh12 = 100;
		*/
		/*
		int rng;
		TimerTask task = new TimerTask()
		{
			public void run()
			{
				rng = (int)(Math.random() * (60 - 0) + 0);
			
			}
		};
		java.util.Timer t = new java.util.Timer(true);
		
		t.schedule(task, 0, 1000); 
		for(int iii=0; iii<1000000; iii++)
		{
			System.out.println(t);
		}
		*/
	}
	/*
	public int rngTimer()
	{
		final BlockingDequeue<Integer> queue = new LinkedBlockingDequeue<Integer>();
		
		TimerTask task = new TimerTask()
		{
			public void run()
			{
				queue.put(Math.round(Math.random() * 60));
			
			}
		};
		java.util.Timer t = new java.util.Timer(true);
		
		t.schedule(task, 0, 1000); 
		int numbers = 100000;
		for (int i = 0; i < numbers; i++) 
		{
			 Inetger rngTimer = queue.remove();
		}
		
		return rand;
	}*/
	public void update()
	{
		double width = getWidth();
		double height = getHeight();
		TimerExample te = new TimerExample();
		System.out.println(te.currRand);
		System.out.println("did i get this far?");
		try
		{
			System.out.println("bruh?");
			if(te.currRand == 0 || te.currRand ==4 || te.currRand ==1 || te.currRand ==2 || te.currRand ==3)
			{
				ballh[0] = 150;
				ballw[0] = 150;
				
				TimeUnit.SECONDS.sleep(1);
				ballh[0] = 100;
				ballw[0] = 100;
				
			}
			else if(te.currRand >=5 && te.currRand <10)
			{
				ballh[1] = 150;
				ballw[1] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[1] = 100;
				ballw[1] = 100;
				
			}
			else if(te.currRand >=10 && te.currRand <15)
			{
				ballh[2] = 150;
				ballw[2] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[2] = 100;
				ballw[2] = 100;
			}
			else if(te.currRand >=15 && te.currRand <20)
			{
				ballh[3] = 150;
				ballw[3] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[3] = 100;
				ballw[3] = 100;
			}
			else if(te.currRand >=20 && te.currRand <25)
			{
				ballh[4] = 150;
				ballw[4] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[4] = 100;
				ballw[4] = 100;
			}
			else if(te.currRand >=25 && te.currRand <30)
			{
				ballh[5] = 150;
				ballw[5] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[5] = 100;
				ballw[5] = 100;
			}
			else if(te.currRand >=30 && te.currRand <35)
			{
				ballh[6] = 150;
				ballw[6] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[6] = 100;
				ballw[6] = 100;
			}
			else if(te.currRand >=35 && te.currRand <40)
			{
				ballh[7] = 150;
				ballw[7] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[7] = 100;
				ballw[7] = 100;
			}
			else if(te.currRand >=40 && te.currRand <45)
			{
				ballh[8] = 150;
				ballw[8] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[8] = 100;
				ballw[8] = 100;
			}
			else if(te.currRand >=45 && te.currRand <50)
			{
				ballh[9] = 150;
				ballw[9] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[9] = 100;
				ballw[9] = 100;
			}
			else if(te.currRand>=50 && te.currRand<55)
			{
				ballh[10] = 150;
				ballw[10] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[10] = 100;
				ballw[10] = 100;
			}
			else if(te.currRand>=55 && te.currRand<61)
			{
				ballh[11] = 150;
				ballw[11] = 150;
				TimeUnit.SECONDS.sleep(1);
				ballh[11] = 100;
				ballw[11] = 100;
			}
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
		
		
	}
	public void paintComponent(Graphics g) 
	{
		
		
		super.paintComponent(g);
		//int counter =0;
		
		/*
		if(counter ==0)
		{
			*/
			setForeground(Color.BLACK);
			for (int pc=0; pc<ballx.length; pc++)
			{
				setForeground(Color.BLACK);
				g.fillOval((int)ballx[pc], (int)bally[pc], (int)ballw[pc], (int)ballh[pc]);
			}
			/*
			g.fillOval((int)ballx2, (int)bally2, (int)ballw2, (int)ballh2);
			g.fillOval((int)ballx3, (int)bally3, (int)ballw3, (int)ballh3);
			g.fillOval((int)ballx4, (int)bally4, (int)ballw4, (int)ballh4);
			g.fillOval((int)ballx5, (int)bally5, (int)ballw5, (int)ballh5);
			g.fillOval((int)ballx6, (int)bally6, (int)ballw6, (int)ballh6);
			g.fillOval((int)ballx7, (int)bally7, (int)ballw7, (int)ballh7);
			g.fillOval((int)ballx8, (int)bally8, (int)ballw8, (int)ballh8);
			g.fillOval((int)ballx9, (int)bally9, (int)ballw9, (int)ballh9);
			g.fillOval((int)ballx10, (int)bally10, (int)ballw10, (int)ballh10);
			g.fillOval((int)ballx11, (int)bally11, (int)ballw11, (int)ballh11);
			g.fillOval((int)ballx12, (int)bally12, (int)ballw12, (int)ballh12);
			*/
			//System.out.println("did it do this?");
			
			
			//counter++;
		//}
		
		
			/*
			try
			{
		
				TimeUnit.SECONDS.sleep(1);
				
				for(int i=1; i>0;i--)
				{
					TimerExample te = new TimerExample();
					System.out.println(te.currRand);
					System.out.println("did i get this far?");
					if(te.currRand == 0 || te.currRand ==4 || te.currRand ==1 || te.currRand ==2 || te.currRand ==3)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx1, (int)bally1, (int)ballw1, (int)ballh1);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx1, (int)bally1, (int)ballw1, (int)ballh1);
						
					}
					
					else if(te.currRand >=5 && te.currRand <10)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx2, (int)bally2, (int)ballw2, (int)ballh2);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx2, (int)bally2, (int)ballw2, (int)ballh2);
					}
					
					else if(te.currRand >=10 && te.currRand <15)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx3, (int)bally3, (int)ballw3, (int)ballh3);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx3, (int)bally3, (int)ballw3, (int)ballh3);
					}
					
					else if(te.currRand >=15 && te.currRand <20)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx4, (int)bally4, (int)ballw4, (int)ballh4);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx4, (int)bally4, (int)ballw4, (int)ballh4);
					}
					
					else if(te.currRand >=20 && te.currRand <25)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx5, (int)bally5, (int)ballw5, (int)ballh5);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx5, (int)bally5, (int)ballw5, (int)ballh5);
					}
					
					else if(te.currRand >=25 && te.currRand <30)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx6, (int)bally6, (int)ballw6, (int)ballh6);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx6, (int)bally6, (int)ballw6, (int)ballh6);
					}
					
					else if(te.currRand >=30 && te.currRand <35)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx7, (int)bally7, (int)ballw7, (int)ballh7);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx7, (int)bally7, (int)ballw7, (int)ballh7);
					}
					
					else if(te.currRand >=35 && te.currRand <40)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx8, (int)bally8, (int)ballw8, (int)ballh8);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx8, (int)bally8, (int)ballw8, (int)ballh8);
					}
					
					else if(te.currRand >=40 && te.currRand <45)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx9, (int)bally9, (int)ballw9, (int)ballh9);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx9, (int)bally9, (int)ballw9, (int)ballh9);
					}
					
					else if(te.currRand >=45 && te.currRand <50)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx10, (int)bally10, (int)ballw10, (int)ballh10);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx10, (int)bally10, (int)ballw10, (int)ballh10);
					}
					
					else if(te.currRand>=50 && te.currRand<55)
					{	
						setForeground(Color.RED);
						g.fillOval((int)ballx11, (int)bally11, (int)ballw11, (int)ballh11);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx11, (int)bally11, (int)ballw11, (int)ballh11);
					}
					
					else if(te.currRand>=55 && te.currRand<=60)
					{
						setForeground(Color.RED);
						g.fillOval((int)ballx12, (int)bally12, (int)ballw12, (int)ballh12);
						TimeUnit.SECONDS.sleep(1);
						setForeground(Color.BLACK);
						g.fillOval((int)ballx12, (int)bally12, (int)ballw12, (int)ballh12);
					}
					else
					{
						
						setForeground(Color.BLACK);
						g.fillOval((int)ballx1, (int)bally1, (int)ballw1, (int)ballh1);
						g.fillOval((int)ballx2, (int)bally2, (int)ballw2, (int)ballh2);
						g.fillOval((int)ballx3, (int)bally3, (int)ballw3, (int)ballh3);
						g.fillOval((int)ballx4, (int)bally4, (int)ballw4, (int)ballh4);
						g.fillOval((int)ballx5, (int)bally5, (int)ballw5, (int)ballh5);
						g.fillOval((int)ballx6, (int)bally6, (int)ballw6, (int)ballh6);
						g.fillOval((int)ballx7, (int)bally7, (int)ballw7, (int)ballh7);
						g.fillOval((int)ballx8, (int)bally8, (int)ballw8, (int)ballh8);
						g.fillOval((int)ballx9, (int)bally9, (int)ballw9, (int)ballh9);
						g.fillOval((int)ballx10, (int)bally10, (int)ballw10, (int)ballh10);
						g.fillOval((int)ballx11, (int)bally11, (int)ballw11, (int)ballh11);
						g.fillOval((int)ballx12, (int)bally12, (int)ballw12, (int)ballh12);
						System.out.println("did it do this?");
						
					}
				}
				
				
			}
			
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			*/
			
		
		
		
		
		
		
	}
}


  