package recursion.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.SpringLayout;

import recursion.controller.*;

public class RecurPanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	
	private JScrollPane resultsPane;
	private JPanel buttonPanel;
	private JPanel menuPanel;
	private JTextField inputField;
	private JTextArea resultArea;
	private JButton fibButton;
	private JButton factButton;
	private JButton stringButton;
	private JButton voidButton; 
	private JButton sortButton; 

	
	public RecurPanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		
		this.resultsPane = new JScrollPane();
		this.buttonPanel = new JPanel(new GridLayout(1,0));
		this.menuPanel = new JPanel(new GridLayout(0, 1));
		this.resultArea = new JTextArea();
		this.inputField = new JTextField("Input Here");
		this.fibButton = new JButton("Fibonacci");
		this.factButton = new JButton("Factorial ");
		this.stringButton = new JButton("String recursion");
		this.voidButton = new JButton("void recursion");
		this.sortButton = new JButton("use quickSort");
		
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	
	private void setupPanel()
	{
		setLayout(layout);
		resultsPane.setViewportView(resultArea);
		
		this.add(resultsPane);
		this.add(menuPanel);
		
		this.menuPanel.add(buttonPanel);
		this.menuPanel.add(inputField);
		
		this.buttonPanel.add(factButton);
		this.buttonPanel.add(fibButton);
		this.buttonPanel.add(stringButton);
		this.buttonPanel.add(voidButton);
		this.buttonPanel.add(sortButton);
		
		this.resultArea.setEnabled(true);
		this.resultArea.setWrapStyleWord(true);
		this.resultArea.setLineWrap(true);
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(click -> factorialLoad());
		fibButton.addActionListener(click -> fibLoad());
		stringButton.addActionListener(click -> stringLoad());
		voidButton.addActionListener(click -> voidLoad());
		sortButton.addActionListener(click -> useSort());
	}
	
	private void factorialLoad()
	{
		String vaule = inputField.getText();
		
		String result = app.factorialInfo(vaule);
		
		resultArea.setText(result);
	}
	
	private void fibLoad()
	{
		String value = inputField.getText();
		
		//Check so you dont blow up your pc like i did 
		if (Integer.parseInt(value) >= 42)
		{
			int errordialoge = JOptionPane.showOptionDialog(null, "Fib over 42 can take a long time to compute, or will error out entirely. Continue?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
			if (errordialoge == JOptionPane.NO_OPTION)
			{
				resultArea.setText("");
			}
			else
			{
				String result = app.fibonacciInfo(value);
				
				resultArea.setText(result);
			}
		}
		
		String result = app.fibonacciInfo(value);
		
		resultArea.setText(result);
	}
	
	private void stringLoad()
	{
		String value = inputField.getText();
		
		String result = app.reverseInfo(value);
		
		resultArea.setText(result);
	}
	
	private void voidLoad()
	{
		String value = inputField.getText();
		
		String result = app.voidInfro(value);
		
		resultArea.setText(result);
	}
	
	private void useSort()
	{
		resultArea.setText(app.useQuickSort());
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, resultsPane, 20, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, resultsPane, 200, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, resultsPane, -20, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, resultsPane, 20, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, menuPanel, 20, SpringLayout.SOUTH, resultsPane);
		layout.putConstraint(SpringLayout.EAST, menuPanel, 0, SpringLayout.EAST, resultsPane);
		layout.putConstraint(SpringLayout.WEST, menuPanel, 0, SpringLayout.WEST, resultsPane);
		layout.putConstraint(SpringLayout.SOUTH, menuPanel, -20, SpringLayout.SOUTH, this);
	}

}
