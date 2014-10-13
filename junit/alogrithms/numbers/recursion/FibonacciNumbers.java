package alogrithms.numbers.recursion;

public class FibonacciNumbers
{
	public static int getFibonnaciNumber(int n)
	{
		if(n <= 1)
			return 1;
		else
			return getFibonnaciNumber(n - 2) + getFibonnaciNumber(n -1);
		
	}
	
	public static void main(String[] args)
	{
		for (int i = 1; i < 10; i++)
		{
			int fibon = getFibonnaciNumber(i);
			System.out.println(fibon);
		}	
	}
}
