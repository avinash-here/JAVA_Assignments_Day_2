package com.assignment;

public class Problem_4 {
	
	static void TotalScore(int ones, int twos, int threes, int fours,int sixes) {
		
		System.out.println(ones*1 + twos*2 + threes*3 + fours*4 + sixes*6);
	}

	public static void main(String[] args) {


		int ones = 16;
		int twos = 5;
		int threes = 0;
		int fours = 7;
		int sixes = 3;
		
		Problem_4.TotalScore(ones,twos,threes,fours,sixes);

	}

}
