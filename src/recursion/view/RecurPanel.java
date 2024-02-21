package recursion.view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import recursion.controller.*;

public class RecurPanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;

	
	public RecurPanel(Controller app)
	{
		this.app = app;
		this.layout = new SpringLayout();
		
		
	}

}
