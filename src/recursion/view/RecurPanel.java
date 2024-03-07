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

	
	public RecurPanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		
		this.resultsPane = new JScrollPane();
		this.buttonPanel = new JPanel(new GridLayout(1,0));
		this.menuPanel = new JPanel(new GridLayout(0, 1));
		this.resultArea = new JTextArea();
		this.inputField = new JTextField("Numbers only");
		this.fibButton = new JButton("Fibonacci");
		this.factButton = new JButton("Factorial ");
		this.stringButton = new JButton("Strubg recursion");
		this.voidButton = new JButton("void recursion");
		
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
		
		this.resultArea.setEnabled(true);
		this.resultArea.setWrapStyleWord(true);
		this.resultArea.setLineWrap(true);
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(click -> factorialLoad());
		fibButton.addActionListener(click -> fibLoad());
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
		
		String result = app.fibonacciInfo(value);
		
		resultArea.setText(result);
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
