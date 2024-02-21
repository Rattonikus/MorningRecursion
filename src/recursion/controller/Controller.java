package recursion.controller;

import java.math.BigInteger;

import recursion.model.RecursionDemo;
import recursion.view.RecurFrame;

public class Controller 
{
	
	private RecurFrame window; 
	
	
	public Controller()
	{
	}
	
	public void start()
	{
		this.window = new RecurFrame(this);

	}
	
	public String factorialInfo(String source)
	{
		String result = "The int based factorial of " + source + " is :\n";
		
		int intVersion = Integer.parseInt(source);
		
		result += RecursionDemo.factorialDemo(intVersion);
		
		result += "\n";
		
		result += "The double version is :\n";
		
		double doubleVersion = (double) intVersion; 
		
		result += RecursionDemo.factorialDemo(doubleVersion);
		
		result += "\n\n";
		
		result += "Are they the same? ";
		
		BigInteger large = new BigInteger(source);
		
		result += "The BigInteger version is : " + large.toString();
		
		return result;
	}

}
