
import java.awt.*;
import javax.swing.*;

public class CanvasGui extends JPanel
{
	public int playerScore = 0;
	public int botScore = 0;

	// ball stuff
	public double bx,by; // top left corner of ball
	public double bw,bh; // width and height of ball
	public double bvx,bvy;

	// paddle stuff
	public double pw, ph, ps, prs;   // paddle width and height, speed
	public double plx, ply; // paddle left x,y
	public double plvx, plvy; // left paddle velocity x,y
	public double prx, pry; // paddle right x,y
	public double prvx, prvy; // right paddle velocity

	public CanvasGui()
	{
		// ball
		bx = 200;
		by = 200;
		bw = 30;
		bh = 30;
		bvx = 4.0;
		bvy = 1.0;

		// general paddle stuff
		pw = 12;
		ph = 50; 
		ps = 10.0;
		prs = 2.0;

		// left paddle
		plx = 10;
		ply = 10;
		plvx = 0;
		plvy = 0;

		// right paddle 
		prx = 100;
		pry = 10;
		prvx = 0;
		prvy = 0;
	}

	public void update()
	{
		double width = getWidth();
		double height = getHeight();
		double english = 0.1;

		if (width == 0 || height == 0) return;

		// right paddle update (bot)
		prx = width - (pw + 10);
		double paddleCenter = pry + ph/2;
		double ballCenter = by + bh/2;
		if (paddleCenter > ballCenter)
		{
			pry -= prs;
		}
		else if (paddleCenter < ballCenter)
		{
			pry += prs;
		}

		// left paddle update (player)
		ply = ply + plvy;
		if (ply > (height-ph))
		{
			ply = height-ph;
		}
		if (ply < 0)
		{
			ply = 0;
		}

		// ball "physics"
		bx += bvx;
		by += bvy;

		if (bx < 0)
		{
			bvx = Math.abs(bvx);
			botScore++;
			bx = width/2;
			by = height/2;
			bvy = 0;
		}
		if ((bx+bw) > width)
		{
			bvx = -Math.abs(bvx);
			playerScore++;
			bx = width/2;
			by = height/2;
			bvy = 0;
		}

		if (by < 0)
		{
			bvy = Math.abs(bvy);
		}
		if ((by+bh) > height)
		{
			bvy = -Math.abs(bvy);
			by = height - bh;
		}

		// collision with left paddle
		if ((bx < plx+pw) && 
			(by < ply+ph) &&
			(by+bh > ply))
		{
			bvx = Math.abs(bvx);
			double bc = by + bh/2;
			double pc = ply + ph/2;
			bvy += (bc-pc)*english;
		}

		// collision with right paddle
		if (((bx+bw) > prx) &&
			(by < pry+ph) &&
			(by+bh > pry))
		{
			bvx = -Math.abs(bvx);
			double bc = by + bh/2;
			double pc = pry + ph/2;
			bvy += (bc-pc)*english;
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		setForeground(Color.RED);
		g.fillOval((int)bx, (int)by, (int)bw, (int)bh);

		//setForeground(Color.BLACK);
		g.fillRect((int) plx, (int) ply, (int) pw, (int) ph);
		g.fillRect((int) prx, (int) pry, (int) pw, (int) ph);

		String score = "Player:" + playerScore + "  Bot:" + botScore;
		g.drawString(score, 50, 10);
	}
}



