package recursion.controller;

import java.math.BigInteger;
import java.util.Arrays;

import javax.swing.JOptionPane;

import recursion.model.RecursionDemo;
import recursion.view.RecurFrame;

public class Controller 
{
	
	private RecurFrame window; 
	
	int[] someNums = {1,6,8,3,6,7,3,32,5};
	
	public Controller()
	{
	}
	
	public void start()
	{
		new RecurFrame(this);
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
	
	public String fibonacciInfo(String source) // An interesting observation. The bigger the number, the longer it takes to process, this seems to cap out around ~ 43
	{
		String result = "The fib of " + source + " is :\n";
		
		int intVersion = Integer.parseInt(source);
		
		result += RecursionDemo.fibonacciDemo(intVersion);
		
		result += "\n";
		
		result += "Doing the same iteravely results in :\n";
		
		result += RecursionDemo.fibonacciIterative(intVersion);
		
		result += "\n running fib as a loop results in: \n";
		
		result += RecursionDemo.fibLoop(intVersion);
		
		return result;

	}
	
	public String reverseInfo(String source)
	{
		String result = "You typed in " + source + "\n";
		
		result += "Reverse, that would look like this: \n";
		result += RecursionDemo.reverse(source) + "\n";
		result += "Can you try saying that?";
		
		return result;
	}
	
	public String voidInfro(String source)
	{
		String result = "Look in the console :3";
		
		RecursionDemo.countDown(Integer.parseInt(source));
		
		return result;
	}
	
	public String useQuickSort()
	{
		String result = "This arrray of ints currently looks like this: \n";
		result += Arrays.toString(someNums) + "\n";
		RecursionDemo.quickSort(someNums, 0, someNums.length - 1);
		result += "After sorting, its now: \n";
		result += Arrays.toString(someNums) + "\n";

		return result; 
	}

}
