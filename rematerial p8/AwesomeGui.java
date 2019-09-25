
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AwesomeGui extends JFrame
	implements ActionListener, KeyListener
{
	JButton topButton;
	JButton bottomButton;
	//JLabel  centerLabel;
	CanvasGui centerCanvas;

	javax.swing.Timer timer;

	public void keyPressed(KeyEvent event)
	{
		//VK_KP_UP, VK_KP_DOWN, VK_KP_LEFT, VK_KP_RIGHT
		if (event.getKeyCode() == KeyEvent.VK_UP) 
		{
			centerCanvas.plvy = -centerCanvas.ps;
		}
		else if (event.getKeyCode() == KeyEvent.VK_DOWN) 
		{
			centerCanvas.plvy = centerCanvas.ps;
		}

		System.out.println("keyPressed");
	}

	public void keyTyped(KeyEvent event)
	{
		System.out.println("keyTyped");
	}

	public void keyReleased(KeyEvent event)
	{
		//System.out.println("keyReleased");
		centerCanvas.plvy = 0;
	}


	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if (source == topButton)
		{
			
		}
		else if (source == bottomButton)
		{
			//
		}
		else if (source == timer)
		{
			//System.out.println("timer");
			centerCanvas.update();
		}
		//System.out.println("A button was pressed!!!!");
		repaint();
	}

	public AwesomeGui()
	{
		super("Awesome Gui!!!");
		setSize(800,600);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		topButton = new JButton("press me!");
		contentPane.add(topButton, BorderLayout.NORTH);
		topButton.addActionListener(this);

		bottomButton = new JButton("bottom press!");
		contentPane.add(bottomButton, BorderLayout.SOUTH);
		bottomButton.addActionListener(this);

		centerCanvas = new CanvasGui();
		contentPane.add(centerCanvas, BorderLayout.CENTER);

		timer = new javax.swing.Timer(17, this);
		timer.start();

		topButton.addKeyListener(this);
		bottomButton.addKeyListener(this);
	}

	public static void main(String[] args)
	{
		AwesomeGui gui = new AwesomeGui();

		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("fun times");
	}
}