package com.assignment;

public class Problem_2 {
	
	static void Factors (int n) {
		
		if(n > 100 || n < 2) {
			System.out.println("Invalid Number");
		}
		else
		{
			for(int i = 1; i <= n; i++)
			{
				if (n % i == 0)
					System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		
		int n = 0;
		
		Problem_2.Factors(n);

	}

}
