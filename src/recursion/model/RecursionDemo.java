package recursion.model;

import java.math.BigInteger;

public class RecursionDemo 
{
	
	//FACTORIAL 
	public static int factorialDemo(int number)
	{
		if (number == 0 || number ==1)
		{
			return 1; 
		}
		else
		{
			return factorialDemo(number - 1) * number; 
		}
	}
	
	public static double factorialDemo(double number)
	{
		if (number == 0.0 || number == 1.0)
		{
			return 1.0; 
		}
		else
		{
			return factorialDemo(number - 1.0) * number; 
		}
	}
	
	public static BigInteger factorialDemo(BigInteger number)
	{
		if(number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE))
		{
			return BigInteger.ONE;
		}
		else
		{
			return number.multiply(factorialDemo(number.subtract(BigInteger.ONE)));
		}
	}
	
	
	//FIBONACCI
	public static int fibonacciDemo(int number)
	{
		if (number <=1)
		{
			return number; 
		}
		else
		{
			return fibonacciDemo(number - 1) + fibonacciDemo(number - 2);
		}
	}
	
	
	public static int fibonacciIterative(int number)
	{
		if (number <= 1)
		{
			return number;
		}
		else
		{
			int current = 1;
			int previous = 1;
			
			for (int index = 2; index < number; index ++)
			{
				int temp = current;
				current += previous;
				previous = temp;
			}
			
			return current;
		}
	}
	
	
	
	

}
