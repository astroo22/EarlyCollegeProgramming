
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoolGui extends JFrame
	implements ActionListener
{
	JButton topButton;
	JButton bottomButton;
	JLabel  centerLabel;

	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if (source == topButton)
		{
			this.centerLabel.setText("Top button pressed!!!!!");
		}
		else if (source == bottomButton)
		{
			this.centerLabel.setText("bottom");
		}
		System.out.println("A button was pressed!!!!");
	}

	public CoolGui()
	{
		super("Cool Gui!!!");
		setSize(300,300);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		topButton = new JButton("press me!");
		contentPane.add(topButton, BorderLayout.NORTH);
		topButton.addActionListener(this);

		bottomButton = new JButton("bottom press!");
		contentPane.add(bottomButton, BorderLayout.SOUTH);
		bottomButton.addActionListener(this);

		centerLabel = new JLabel("Awesome Text!");
		centerLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(centerLabel, BorderLayout.CENTER);
	}

	public static void main(String[] args)
	{
		CoolGui gui = new CoolGui();

		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("fun times");
	}
}