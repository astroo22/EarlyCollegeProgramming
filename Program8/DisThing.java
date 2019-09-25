import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;


public class DisThing extends JFrame
implements ActionListener
//, MouseListener
{
	GameGui centerCanvas;
	javax.swing.Timer timer;
	
	public static void main(String[] args) throws InterruptedException
	{
		DisThing dis = new DisThing();
	
		dis.setVisible(true);
		dis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public DisThing()
	{
		super("Click The Things");
		setSize(1200,900);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		centerCanvas = new GameGui();
		contentPane.add(centerCanvas, BorderLayout.CENTER);
		
		
		timer = new javax.swing.Timer(17, this);
		timer.start();
		
		
	}
	public void actionPerformed(ActionEvent event)
	{
		centerCanvas.update();
		repaint();
	}
	/*
	public void mousePressed(MouseEvent e)
	{
		/*
		int x getX(e);
		int y getY(e);
		if(x<=ballx[t] && x>=ballx[t] +100
		
		;
	}
	*/
	
	
}