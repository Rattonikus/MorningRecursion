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
	
	public static int fibLoop(int number)
	{
		int fib = number;

		
		for(int i = 0; i <= number; i++)
		{
			fib = (fib - 1) + (fib - 2);
		}
		
		return fib;
	}
	
	//STRING
	
	public static String reverse(String str)
	{
	    if ((str == null) || (str.length() <= 1)) 
	    {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
	//VOID
	public static void countDown(int num)
	{
		if (num == 0)
		{
			System.out.println("We have reached the end o7");
			return;
		}
		
		System.out.println("Gimmie a " + num);
		
		int newNumber = num - 1;
		
		countDown(newNumber);
	}
	
	//QUICK SORT
	
	public static void quickSort(int nums[], int begin, int end) //nums is an ARRAY of strings... dont forget
	{
	    if (begin < end) 
	    {
	        int partitionIndex = partition(nums, begin, end);

	        quickSort(nums, begin, partitionIndex-1);
	        quickSort(nums, partitionIndex+1, end);
	    }
	}

	private static int partition(int nums[], int begin, int end) //same as before, also note how this method can stay private.
	{
	    int pivot = nums[end];
	    int i = (begin-1);

	    for (int n = begin; n < end; n++) 
	    {
	        if (nums[n] <= pivot) 
	        {
	            i++;

	            int swapTemp = nums[i];
	            nums[i] = nums[n];
	            nums[n] = swapTemp;
	        }
	    }

	    int swapTemp = nums[i+1];
	    nums[i+1] = nums[end];
	    nums[end] = swapTemp;

	    return i+1;
	}

}
