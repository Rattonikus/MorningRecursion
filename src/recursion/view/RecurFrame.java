package recursion.view;

import javax.swing.JFrame;
import recursion.controller.*;

public class RecurFrame extends JFrame
{
	private Controller controller; 
	
	private RecurPanel panel; 
	
	public RecurFrame(Controller controller)
	{
		super();
		this.controller = controller;
		this.panel = new RecurPanel(this.controller);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(800, 600);
		this.setTitle("Recursion");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
